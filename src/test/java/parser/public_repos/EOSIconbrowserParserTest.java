package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSIconbrowserParserTest extends BasePlatformTestCase {

    public void testEOSIconbrowserRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/iconbrowser/archive/refs/heads/main.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_iconbrowser", 0, errorsToIgnore);
    }
}
