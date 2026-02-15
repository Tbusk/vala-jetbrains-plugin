package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSScreenshotParserTest extends BasePlatformTestCase {

    public void testEOSScreenshotRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/screenshot/archive/refs/tags/8.0.4.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_screenshot", 0, errorsToIgnore);
    }
}
