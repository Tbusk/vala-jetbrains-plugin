package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSQuickSettingsParserTest extends BasePlatformTestCase {

    public void testEOSQuickSettingsRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/quick-settings/archive/refs/heads/main.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_quick_settings", 0, errorsToIgnore);
    }
}
