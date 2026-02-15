package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSCodeParserTest extends BasePlatformTestCase {

    public void testEOSCodeRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/code/archive/refs/tags/8.1.2.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of(
                        "spell.vala", // will be fixed with preprocessor support
                        "file-item.vala" // will be fixed with introspection of template strings
                )
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_code", 0, errorsToIgnore);
    }
}
