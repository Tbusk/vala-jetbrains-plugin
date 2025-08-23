import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class IntegrationTestUtils {

    public static List<Path> getSourceFilePaths(final Path testDirPath) throws IOException {

        assert (testDirPath != null) : "testDirPath must not be null";

        List<Path> files;

        try (Stream<Path> stream = Files.walk(testDirPath)) {
            files = stream.filter(file -> file.getFileName().toString().endsWith(".vala") || file.getFileName().toString().endsWith(".vapi"))
                    .toList();
        }

        return files;
    }
}
