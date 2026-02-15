package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSGreeterParserTest extends BasePlatformTestCase {

    public void testEOSGreeterRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/greeter/archive/refs/tags/8.1.2.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of(
                        "WindowManager.vala", // will fix with preprocessor support
                        "mutter-clutter.vapi", // will fix with preprocessor support
                        "mutter-cogl-14.vapi", // will fix with preprocessor support
                        "libmutter.vapi" // will fix with preprocessor support
                )
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_greeter", 0, errorsToIgnore);
    }
}
