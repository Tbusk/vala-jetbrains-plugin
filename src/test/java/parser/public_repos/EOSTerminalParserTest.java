package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSTerminalParserTest extends BasePlatformTestCase {

    public void testEOSTerminalRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/terminal/archive/refs/tags/7.2.0.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_terminal", 0, errorsToIgnore);
    }
}
