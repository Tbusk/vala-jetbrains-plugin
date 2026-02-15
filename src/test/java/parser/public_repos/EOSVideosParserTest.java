package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSVideosParserTest extends BasePlatformTestCase {

    public void testEOSVideosRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/videos/archive/refs/tags/8.0.2.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_videos", 0, errorsToIgnore);
    }
}
