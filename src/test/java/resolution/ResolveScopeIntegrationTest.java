package resolution;

public class ResolveScopeIntegrationTest extends ValaSimpleNameResolution {

    public void testShouldResolveParameterOnlyInsideMethod() {
        // language=Vala
        String snippet =
            """
                stdout.printf ("Hello %s", <caret>name);
                
                void say_hello (string name) {
                    stdout.printf ("Hello %s", name);
                }
                
                stdout.printf ("Hello %s", <caret>name);
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "name",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "name",
            1
        );
    }

    public void testShouldResolveLocalVariableDeclaredInMethodOnlyInsideMethod() {
        // language=Vala
        String snippet =
            """
                stdout.printf ("Hello %s", <caret>name);
                
                void say_hello () {
                    string name = "John";
                    stdout.printf ("Hello %s", name);
                }
                
                stdout.printf ("Hello %s", <caret>name);
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "name",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "name",
            1
        );
    }

    public void testShouldResolveDeclaredVariableOnlyInsideWithBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    with (int x = 0) {
                        stdout.printf ("%d", x);
                    }
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );
    }

    public void testShouldResolveDeclaredVariableOnlyInsideForBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>i);
                
                    for (int i = 0; i < 10; i++) {
                        stdout.printf ("%d", i);
                    }
                
                    stdout.printf ("%d", <caret>i);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "i",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "i",
            1
        );
    }

    public void testShouldResolveDeclaredVariableOnlyInsideForeachBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>num);
                
                    int[] nums = { 1, 2, 3 };
                
                    foreach (int num in nums) {
                        stdout.printf ("%d", num);
                    }
                
                    stdout.printf ("%d", <caret>num);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "num",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "num",
            1
        );
    }

    public void testShouldResolveFieldOnlyInsideClass() {
        // language=Vala
        String snippet =
            """
                
                stdout.printf ("%d", <caret>x);
                
                class Test {
                    int x = 0;
                }
                
                stdout.printf ("%d", <caret>x);
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );
    }

    public void testShouldResolveConstantOnlyInsideClass() {
        // language=Vala
        String snippet =
            """
                
                stdout.printf ("%d", <caret>X);
                
                class Test {
                    const int X = 0;
                }
                
                stdout.printf ("%d", <caret>X);
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "X",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "X",
            1
        );
    }

    public void testShouldResolvePropertyOnlyInsideClass() {
        // language=Vala
        String snippet =
            """
                namespace Test {
                    void main2 () {
                        stdout.printf ("%d", <caret>x);
                    }
                
                    class TestClass {
                        int x { get; set; default = 0; }
                    }
                
                    void main () {
                        stdout.printf ("%d", <caret>x);
                    }
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );
    }

    public void testShouldResolveLocalVariableDeclaredInIfOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    if (true) {
                        int x = 0;
                    } else if (false) {
                        stdout.printf ("%d", <caret>x);
                    } else {
                        stdout.printf ("%d", <caret>x);
                    }
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            2
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            3
        );
    }

    public void testShouldResolveLocalVariableDeclaredInElseIfOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    if (false) {
                        stdout.printf ("%d", <caret>x);
                    } else if (true) {
                        int x = 0;
                    } else {
                        stdout.printf ("%d", <caret>x);
                    }
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            2
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            3
        );
    }

    public void testShouldResolveLocalVariableDeclaredElseOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    if (false) {
                        stdout.printf ("%d", <caret>x);
                    } else if (true) {
                        stdout.printf ("%d", <caret>x);
                    } else {
                        int x = 0;
                    }
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            2
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            3
        );
    }

    public void testShouldNotResolveVariableDeclaredInNestedIfOutsideOfIt() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    if (false) {
                        stdout.printf ("%d", <caret>x);
                
                        if (true) {
                            int x = 0;
                        }
                        stdout.printf ("%d", <caret>x);
                    }
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            2
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            3
        );
    }

    public void testShouldResolveLocalVariableDeclaredWhileOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    while (true) {
                        int x = 0;
                    }
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );
    }

    public void testShouldResolveLocalVariableDeclareDoWhileOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    do {
                        int x = 0;
                    } while (true);
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );
    }

    public void testShouldResolveLocalVariableDeclareTryOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    try {
                        int x = 0;
                    } catch {
                        stdout.printf ("%d", <caret>x);
                    } finally {
                        stdout.printf ("%d", <caret>x);
                    }
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            2
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            3
        );
    }

    public void testShouldResolveLocalVariableDeclareCatchOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    try {
                        stdout.printf ("%d", <caret>x);
                    } catch {
                        int x = 0;
                    } finally {
                        stdout.printf ("%d", <caret>x);
                    }
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            2
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            3
        );
    }

    public void testShouldResolveLocalVariableDeclareFinallyOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    try {
                        stdout.printf ("%d", <caret>x);
                    } catch {
                        stdout.printf ("%d", <caret>x);
                    } finally {
                        int x = 0;
                    }
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            2
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            3
        );
    }

    public void testShouldResolveLocalVariableDeclareInSeparateCatchOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>x);
                
                    try {
                        stdout.printf ("%d", <caret>x);
                    } catch (Error e) {
                        int x = 0;
                    } catch (IOError e) {
                        stdout.printf ("%d", <caret>x);
                    }
                
                    stdout.printf ("%d", <caret>x);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            1
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            2
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "x",
            3
        );
    }

    public void testShouldResolveErrorVariableDeclaredInCatchOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                void main () {
                
                    stdout.printf ("%d", <caret>e.message);
                
                    try {
                        stdout.printf ("%s", <caret>e.message);
                    } catch (Error e) {
                        // do nothing
                    } finally {
                        stdout.printf ("%s", <caret>e.message);
                    }
                
                    stdout.printf ("%d", <caret>e.message);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "e",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "e",
            1
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "e",
            2
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "e",
            3
        );
    }

    public void testShouldResolveVariableDeclaredInLambdaOnlyInsideBlock() {
        // language=Vala
        String snippet =
            """
                delegate void LogMessage (string message);
                
                void main () {
                
                    stdout.printf ("%s\n", <caret>message);
                
                    LogMessage log = (message) => {
                        stdout.printf ("%s\n", message);
                    };
                
                    stdout.printf ("%s\n", <caret>message);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "message",
            0
        );

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "message",
            1
        );
    }

    public void testShouldNotResolveParameterOfDelegateOutsideOfIt() {
        // language=Vala
        String snippet =
            """
                delegate void LogMessage (string message);
                
                void main () {
                    stdout.printf ("%s\n", <caret>message);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            null,
            false,
            "message",
            0
        );
    }

}
