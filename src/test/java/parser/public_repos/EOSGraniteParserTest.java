package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSGraniteParserTest extends BasePlatformTestCase {

    public void testEOSGraniteRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/granite/archive/refs/tags/7.8.0.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_granite", 0, errorsToIgnore);
    }
}
