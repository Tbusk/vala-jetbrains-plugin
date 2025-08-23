import com.intellij.openapi.util.io.FileUtil;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SampleCodeParserTest extends BasePlatformTestCase {

    private static final Logger log = LoggerFactory.getLogger(SampleCodeParserTest.class);

    public void testSampleFilesForParsingErrors() throws IOException {

        Path testDir = Path.of("src/test/vala/samples");

        List<Path> files = IntegrationTestUtils.getSourceFilePaths(testDir);

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
            } else {
                log.info("Parse successful for '{}'", testFilePath.getFileName().toString());
            }
        }

        for (String errorFileName : errorFileNames) {
            log.error(errorFileName);
        }

        assertTrue(errorFileNames.isEmpty());
    }
}
