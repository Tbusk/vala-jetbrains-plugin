const string outside_namespace_string = "a string";

const string another_string = @"another class string";

const string yet_another_string =
    """
    a multiline string
    """;

namespace ANamespace {
    const string inside_namespace_string = "another string";
    const string another_string = @"another class string";

    const string yet_another_string =
        """
        a multiline string
        """;

    public class AClass {
        string inside_class_string = "a class string";
       
        string another_string = @"another class string";
        
        string yet_another_string =
        """
        a multiline string
        """;

    }
}