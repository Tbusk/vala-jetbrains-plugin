interface TestEnumInterface {
    private enum Colors {
        RED,
        GREEN,
        BLUE,
        ORANGE,
        TEAL,
        GRAY,
    }

    protected enum Shapes {
        CIRCLE = 1,
        SQUARE = 2,
        TRIANGLE = 3,
        RECTANGLE = 4,
    }

    public enum Sizes {
        SMALL = 10,
        MEDIUM = 20,
        LARGE = 30;

        public uint8[] get_values () {
            return {
                SMALL,
                MEDIUM,
                LARGE
            };
        }
    }
}