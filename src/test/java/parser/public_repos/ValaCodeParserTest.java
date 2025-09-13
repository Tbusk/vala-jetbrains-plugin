package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ValaCodeParserTest extends BasePlatformTestCase {

    public void testValaRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://gitlab.gnome.org/GNOME/vala/-/archive/main/vala-main.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of(
                        "delegate_only.vala",
                        "arrays.vala",
                        "empty-length-0.vala",
                        "enum_only.vala",
                        "struct_only.vala",
                        "glib-2.0.vapi",
                        "regex.vala",
                        "bug761267-2.vala"
                )
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "vala", 0, errorsToIgnore);
    }
}
