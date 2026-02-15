package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ValaLanguageServerParserTest extends BasePlatformTestCase {

    public void testValaLanguageServerRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/vala-lang/vala-language-server/archive/refs/tags/0.48.7.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of(
                        "doccomment.vala", // false-positive
                        "girdocumentation.vala", // false-positive
                        "find_scope.vala", // will be fixed with preprocessor support
                        "symbolvisitor.vala", // will be fixed with preprocessor support
                        "nodesearch.vala", // will be fixed with preprocessor support
                        "symbolenumerator.vala", // will be fixed with preprocessor support
                        "inlayhintnodes.vala" // will be fixed with preprocessor support
                )
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "vala_language_server", 0, errorsToIgnore);


    }
}
