package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSSwitchboardParserTest extends BasePlatformTestCase {

    public void testEOSSwitchboardRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/settings/archive/refs/tags/8.0.3.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_switchboard", 0, errorsToIgnore);
    }
}
