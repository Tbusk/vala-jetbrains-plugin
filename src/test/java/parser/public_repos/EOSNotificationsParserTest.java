package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSNotificationsParserTest extends BasePlatformTestCase {

    public void testEOSNotificationsRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/notifications/archive/refs/tags/8.1.2.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_notifications", 0, errorsToIgnore);
    }
}
