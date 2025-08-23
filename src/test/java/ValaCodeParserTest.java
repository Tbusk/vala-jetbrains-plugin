import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;

import java.io.IOException;

public class ValaCodeParserTest extends BasePlatformTestCase {

    public void testValaRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://gitlab.gnome.org/GNOME/vala/-/archive/main/vala-main.zip";

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "vala");
    }
}
