package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSGalaParserTest extends BasePlatformTestCase {

    public void testEOSGalaRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/gala/archive/refs/tags/8.4.0.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of(
                        "libmutter.vapi", // will fix with preprocessor support
                        "mutter-cogl-14.vapi", // will fix with preprocessor support
                        "mutter-clutter.vapi", // will fix with preprocessor support
                        "PopupWindow.vala", // will fix with preprocessor support
                        "WindowTracker.vala", // false positive
                        "DesktopIntegration.vala", // false positive
                        "App.vala", // false positive
                        "WindowSwitcher.vala", // will fix with preprocessor support
                        "WindowOverview.vala", // will fix with preprocessor support
                        "Tooltip.vala" // will fix with preprocessor support
                )
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_gala", 0, errorsToIgnore);
    }

}
