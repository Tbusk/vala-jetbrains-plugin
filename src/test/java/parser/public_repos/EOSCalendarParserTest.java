package parser.public_repos;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.apache.commons.compress.compressors.CompressorException;
import parser.IntegrationTestUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EOSCalendarParserTest extends BasePlatformTestCase {

    public void testEOSCalendarRepoParsing() throws CompressorException, IOException {
        final String repositoryZipUrl = "https://github.com/elementary/calendar/archive/refs/heads/master.zip";

        HashSet<String> errorsToIgnore = new HashSet<>(
                Set.of(
                        "util-tests.vala" // can be fixed with introspection of template strings
                )
        );

        IntegrationTestUtils.testRepoSourceFilesForParsingErrors(this.myFixture, repositoryZipUrl, "eos_calendar", 0, errorsToIgnore);
    }
}
