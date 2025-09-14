package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSMailParserTest extends BasePlatformTestCase {

    public void testEOSMailRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/mail/archive/refs/heads/master.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_mail", 0, errorsToIgnore);
    }
}
