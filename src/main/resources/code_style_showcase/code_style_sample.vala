using GLib;

namespace CodeStyle.Sample {

    const string CODE_STYLE_SAMPLE_STRING_LITERAL = "Sample Literal";

    public errordomain CodeStyleErrors {
        INVALID_PROPERTY_NAME
    }

    struct CodeStyleStruct {
        bool space_before_commas;
        bool space_before_method_lparen;
        // ...
    }

    enum CodeStyleEnum {
        SPACE_BEFORE_COMMAS,
        SPACE_BEFORE_METHOD_LPAREN;
    }

    public string[] code_style_property_names() {
        return {
                   "SPACE_BEFORE_COMMAS",
                   "SPACE_BEFORE_METHOD_LPAREN"
        };
    }

    public string concat_names(string name1, string name2) {
        return @"$name1 $name2";
    }

    public interface CodeStyleInterface {
        // ..
    }

    class CodeStyleClass : Object, CodeStyleInterface {

        public int code_style_property_names_length {
            public get;
            public set;
            default = 2;
        }

        public static void main(string[] args) {

            int code_style_property_names_length = 2;
            int properties_left_to_add = 255 - code_style_property_names_length;

            stdout.printf(@"properties left: $properties_left_to_add");

            if (code_style_property_names_length > 0) {

                for (int i = 0; i < code_style_property_names_length; i++) {

                    switch (code_style_property_names()[i]) {
                    case "SPACE_BEFORE_COMMAS":
                        stdout.printf("space before commas");
                        break;
                    case "SPACE_BEFORE_METHOD_LPAREN":
                        stdout.printf("space before method left parenthesis");
                        break;
                    default:
                        stdout.printf("unspecified");
                        break;
                    }
                }

                foreach (string property in code_style_property_names()) {
                    stdout.printf(property);
                }
            }

            uint8 i = 0;
            while (i < code_style_property_names_length) {
                try {
                    stdout.printf(code_style_property_names()[i]);
                } catch (Error e) {
                    stdout.printf("error");
                }

                i++;
            }
        }
    }
}