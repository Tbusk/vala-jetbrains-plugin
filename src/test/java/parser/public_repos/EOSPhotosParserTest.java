package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSPhotosParserTest extends BasePlatformTestCase {

    public void testEOSPhotosRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/photos/archive/refs/tags/8.0.1.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of(
                        "Page.vala" // will be fixed with preprocessor support
                )
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_photos", 0, errorsToIgnore);
    }
}
