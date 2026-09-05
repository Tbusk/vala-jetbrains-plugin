package resolution;

import dev.vala.jetbrains.parser.psi.*;

public class ResolveCorrectlyIntegrationTest extends ValaSimpleNameResolution {

    public void testShouldResolveLocalVariableAfterDeclaration() {
        // language=Vala
        String snippet =
            """
                void main () {
                    int x = 0, y = 1;
                
                    stdout.printf ("%d\n", <caret>x);
                    stdout.printf ("%d\n", <caret>y);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaLocalVariable.class,
            true,
            "x",
            0
        );

        assertSimpleNameResolution(
            snippet,
            ValaLocalVariable.class,
            true,
            "y",
            1
        );
    }

    public void testShouldResolveLocalConstantAfterDeclaration() {
        // language=Vala
        String snippet =
            """
                void main () {
                    const double PI = 3.14d;
                
                    stdout.printf ("%f\n", <caret>PI);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaConstantDeclaration.class,
            true,
            "PI",
            0
        );
    }

    public void testShouldResolveFieldConstantAfterDeclaration() {
        // language=Vala
        String snippet =
            """
                class Test {
                
                    const double PI = 3.14d;
                
                    void main () {
                        stdout.printf ("%f\n", <caret>PI);
                    }
                
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaConstantDeclaration.class,
            true,
            "PI",
            0
        );
    }

    public void testShouldResolveFieldAfterDeclaration() {
        // language=Vala
        String snippet =
            """
                class Test {
                
                    static double pi = 3.14d;
                
                    void main () {
                        stdout.printf ("%f\n", <caret>pi);
                    }
                
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaFieldDeclarationSection.class,
            true,
            "pi",
            0
        );
    }

    public void testShouldResolvePropertyAfterDeclaration() {
        // language=Vala
        String snippet =
            """
                class Test {
                
                    static double pi { get; default = 3.1417d; }
                
                    static void main () {
                        stdout.printf ("%f\n", <caret>pi);
                    }
                
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaPropertyDeclaration.class,
            true,
            "pi",
            0
        );
    }

    public void testShouldResolveLocalVariableInForAfterDeclaration() {
        // language=Vala
        String snippet =
            """
                void main () {
                    for (int i = 0; <caret>i < 10; <caret>i++) {
                        stdout.printf ("%d\n", <caret>i);
                    }
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaLocalVariable.class,
            true,
            "i",
            0
        );

        assertSimpleNameResolution(
            snippet,
            ValaLocalVariable.class,
            true,
            "i",
            1
        );

        assertSimpleNameResolution(
            snippet,
            ValaLocalVariable.class,
            true,
            "i",
            2
        );
    }

    public void testShouldResolveVariablesInForeachAfterDeclaration() {
        // language=Vala
        String snippet =
            """
                void main () {
                    int[] nums = { 1, 2, 3 };
                
                    foreach (int num in <caret>nums) {
                        stdout.printf ("%d\n", <caret>num);
                    }
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaLocalVariable.class,
            true,
            "nums",
            0
        );

        assertSimpleNameResolution(
            snippet,
            ValaForeachStatement.class,
            true,
            "num",
            1
        );
    }

    public void testShouldResolveVariablesInTryCatchAfterDeclaration() {
        // language=Vala
        String snippet =
            """
                void main () {
                    try {
                        // do nothing
                    } catch (Error e) {
                        stdout.printf ("%s\n", <caret>e.message);
                    }
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaCatchClause.class,
            true,
            "e",
            0
        );
    }

    public void testShouldResolveParametersOfMethod() {
        // language=Vala
        String snippet =
            """
                void say_hello (string name) {
                    stdout.printf ("Hello %s\n", <caret>name);
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaParameter.class,
            true,
            "name",
            0
        );
    }

    public void testShouldResolveParametersOfLambda() {
        // language=Vala
        String snippet =
            """
                
                delegate void LogMessage (string message1, string message2);
                
                void main () {
                    LogMessage log = (message1, message2) => {
                        stdout.printf ("%s\n", <caret>message1);
                        stdout.printf ("%s\n", <caret>message2);
                    };
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaLambdaExpressionParam.class,
            true,
            "message1",
            0
        );

        assertSimpleNameResolution(
            snippet,
            ValaLambdaExpressionParam.class,
            true,
            "message2",
            1
        );
    }

    public void testShouldResolveMethod() {
        // language=Vala
        String snippet =
            """
                
                void say_hi (string name) {
                    stdout.printf ("Hi %s\n", name);
                }
                
                void main () {
                    <caret>say_hi ("John");
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaMethodDeclaration.class,
            true,
            "say_hi",
            0
        );
    }

    public void testShouldResolveEnum() {
        // language=Vala
        String snippet =
            """
                enum Season {
                    SPRING, SUMMER, AUTUMN, WINTER;
                
                    public string to_string () {
                        switch (this) {
                            case SPRING:
                                return "Spring";
                            case SUMMER:
                                return "Summer";
                            case AUTUMN:
                                return "Autumn";
                            case WINTER:
                                return "Winter";
                        }
                
                        return "";
                    }
                }
                
                void main () {
                    stdout.printf ("%s", <caret>Season.AUTUMN.to_string ());
                }
                """;

        assertSimpleNameResolution(
            snippet,
            ValaEnumDeclaration.class,
            true,
            "Season",
            0
        );
    }
}
