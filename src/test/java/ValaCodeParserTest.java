import com.intellij.openapi.util.io.FileUtil;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ValaCodeParserTest extends BasePlatformTestCase {

    public void testValaFilesForParsingErrors() throws IOException, GitAPIException {

        String repositoryURL = "https://gitlab.gnome.org/GNOME/vala.git";
        Path repoPath = Path.of("src/test/vala/vala_repo");

        CloneCommand clone = Git.cloneRepository()
                .setURI(repositoryURL)
                .setDirectory(repoPath.toFile());

        // check if source directory already exists
        if (!repoPath.toFile().exists()) {
            clone.call().close();
            throw new IOException("File not found");
        }

        List<Path> files = IntegrationTestUtils.getSourceFilePaths(repoPath);

        assertNotNull(files);

        List<String> errorFileNames = new ArrayList<>();

        for (Path testFilePath : files) {
            String fileName = testFilePath.getFileName().toString();
            assertTrue(Files.exists(testFilePath));
            String content = FileUtil.loadFile(testFilePath.toFile(), StandardCharsets.UTF_8);

            // code insight test fixture, load into memory the file as a PsiFile
            PsiFile psiFile = myFixture.configureByText(fileName, content);
            assertNotNull(psiFile);

            if (PsiTreeUtil.hasErrorElements(psiFile)) {
                errorFileNames.add(fileName);
                System.out.printf("Failed to parse for '%s'\n", testFilePath.getFileName().toString());
            }
        }

        System.out.printf("\nPass rate: %d/%d\n", (files.size() - errorFileNames.size()), files.size());
        //assertTrue(errorFileNames.isEmpty());
    }
}
