import com.intellij.openapi.util.io.FileUtil;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.testFramework.fixtures.CodeInsightTestFixture;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Stream;

public class IntegrationTestUtils {

    private static final Logger log = LoggerFactory.getLogger(IntegrationTestUtils.class);

    public static void testRepoSourceFilesForParsingErrors(final CodeInsightTestFixture testFixture, final String zipUrl, final String repoName) throws IOException, CompressorException {

        assert (testFixture != null) : "testFixture cannot be null.";
        assert (repoName != null) : "repoName cannot be null";
        assert (zipUrl != null) : "zipUrl cannot be null.";

        final String repoFolderPathName = String.format("src/test/vala/%s_repo", repoName);
        final Path repoFolderPath = Path.of(repoFolderPathName);

        final String zipFilePathName = String.format("src/test/vala/%s_repo/%s.zip", repoName, repoName);
        final Path zipFilePath = Path.of(zipFilePathName);

        if (!zipFilePath.toFile().exists()) {
            IntegrationTestUtils.downloadRepositoryZip(zipUrl, repoFolderPath, repoName);
            IntegrationTestUtils.unzipRepositorySourceFilesZip(zipFilePath, repoFolderPath);
        }

        final List<Path> files = IntegrationTestUtils.getSourceFilePaths(repoFolderPath);

        assert (files != null) : "files cannot be null";

        final List<String> errorFileNames = new ArrayList<>();

        for (final Path testFilePath : files) {
            final String fileName = testFilePath.getFileName().toString();
            assert (Files.exists(testFilePath)) : "test files path needs to exist.";

            final String content = FileUtil.loadFile(testFilePath.toFile(), StandardCharsets.UTF_8);

            // code insight test fixture, load into memory the file as a PsiFile
            final PsiFile psiFile = testFixture.configureByText(fileName, content);
            assert (psiFile != null) : "psiFile cannot be null";

            if (PsiTreeUtil.hasErrorElements(psiFile)) {
                errorFileNames.add(fileName);
                log.error("Failed to parse for '{}'", testFilePath.getFileName().toString());
            }
        }

        final int testsPassed = files.size() - errorFileNames.size();
        log.info("Pass rate: {}/{}", testsPassed, files.size());
    }

    public static List<Path> getSourceFilePaths(final Path testDirPath) throws IOException {

        assert (testDirPath != null) : "testDirPath must not be null";
        assert (testDirPath.toFile().exists()) : "testDirPath must exist";

        final List<Path> files;

        try (Stream<Path> stream = Files.walk(testDirPath)) {
            files = stream.filter(file -> file.getFileName().toString().endsWith(".vala") || file.getFileName().toString().endsWith(".vapi"))
                    .toList();
        }

        return files;
    }

    public static void downloadRepositoryZip(final String repositoryZipUrl, final Path targetDir, final String repoName) throws IOException {

        assert (repositoryZipUrl != null) : "repositoryZipUrl must not be null";
        assert (targetDir != null) : "targetDir must not be null";
        assert (repoName != null) : "repoName must not be null";

        if (!targetDir.toFile().exists()) {
            targetDir.toFile().mkdirs();
        }

        assert (repositoryZipUrl.endsWith(".zip")) : "repositoryZipUrl must end with .zip";

        // skip if directory is not empty
        if (Files.size(targetDir) < 5_000) {
            final InputStream inputStream = URI.create(repositoryZipUrl).toURL().openStream();

            final Path zipFilePath = Path.of(targetDir.toString(), String.format("%s.zip", repoName));

            Files.copy(inputStream, zipFilePath, StandardCopyOption.REPLACE_EXISTING);
            log.info("Downloaded repository zip at: {}", zipFilePath);
        }
    }

    public static void unzipRepositorySourceFilesZip(final Path repositoryZipPath, final Path destinationPath) throws IOException, CompressorException {
        assert (repositoryZipPath != null) : "repositoryZipPath must not be null";
        assert (destinationPath != null) : "destinationPath must not be null";

        if (!destinationPath.toFile().exists()) {
            destinationPath.toFile().mkdirs();
        }

        try (final ZipFile zipFile = new ZipFile(repositoryZipPath.toFile())) {
            final Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();

            while (entries.hasMoreElements()) {
                final ZipArchiveEntry entry = entries.nextElement();
                if (entry.getName().endsWith(".vala") || entry.getName().endsWith(".vapi")) {
                    final File entryDestination = new File(destinationPath.toFile(), entry.getName());

                    if (entry.isDirectory()) {
                        entryDestination.mkdirs();
                    } else {
                        entryDestination.getParentFile().mkdirs();
                        try (final InputStream inputStream = zipFile.getInputStream(entry); OutputStream outputStream = new FileOutputStream(entryDestination)) {
                            IOUtils.copy(inputStream, outputStream);
                        }
                    }
                }
            }

            log.info("Unzipped repository zip at: {}", repositoryZipPath);
        }
    }
}
