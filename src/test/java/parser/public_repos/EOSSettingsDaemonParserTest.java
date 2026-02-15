package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSSettingsDaemonParserTest extends BasePlatformTestCase {

    public void testEOSSettingsDaemonRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/settings-daemon/archive/refs/tags/8.5.0.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of(
                        "Application.vala" // will be fixed with preprocessor support
                )
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_settings_daemon", 0, errorsToIgnore);
    }
}
