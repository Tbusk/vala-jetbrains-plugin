package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSCalculatorParserTest extends BasePlatformTestCase {

    public void testEOSCalculatorRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/calculator/archive/refs/tags/8.0.1.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of()
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_calculator", 0, errorsToIgnore);
    }
}
