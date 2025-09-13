package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSWingpanelParserTest extends BasePlatformTestCase {

    public void testEOSWingpanelRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/wingpanel/archive/refs/heads/master.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of(
                        "libmutter.vapi",
                        "mutter-cogl-14.vapi",
                        "BackgroundManager.vala",
                        "mutter-clutter.vapi"
                )
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_wingpanel", 0, errorsToIgnore);
    }
}
