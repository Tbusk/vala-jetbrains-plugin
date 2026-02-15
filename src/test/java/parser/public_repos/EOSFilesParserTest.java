package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSFilesParserTest extends BasePlatformTestCase {

    public void testEOSFilesRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/files/archive/refs/tags/7.2.0.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_files", 0, errorsToIgnore);
    }
}
