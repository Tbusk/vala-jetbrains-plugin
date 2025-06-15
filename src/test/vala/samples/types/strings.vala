const string outside_namespace_string = "a string";

const string another_string = @"another class string";

const string yet_another_string =
    """
    a multiline, verbatim string
    """;

namespace ANamespace {
    const string inside_namespace_string = "another string";

    const string another_string = @"another class string";

    const string yet_another_string =
        """
        a multiline, verbatim string
        """;

    public class AClass {
        string inside_class_string = "a class string";

        // string template with embedded variables and expressions
        string another_string = @"another class string";
        double pi = 3.14159;
        
        string yet_another_string =
        """
        a multiline, verbatim string
        """;
        
        public string get_string_concat () {
            // string template with embedded variables
            return @"$another_string $yet_another_string";
        }

        public string get_inside_class_string () {
            return inside_class_string;
        }

        public string get_another_slice () {
            return another_string[0:6];
        }

        public string get_pi_as_string () {
            return pi.to_string ();
        }

    }
}