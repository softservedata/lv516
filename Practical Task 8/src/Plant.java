        class Plant {
        private Type type;
        private Color color;
        private int size;

        public enum Color {White, Red, Blue};
        public enum Type {Daffodi, Lily, Daisy, Tulip, Poppy, Rose, Bluebell};

        public Plant(String type, String color, int size) throws ColorException, TypeException {
            Color c = colorStrToEnum(color);
            Type t = typeStrToEnum(type);
            this.size = size;
            this.type = t;
            this.color = c;
        }

        private Color colorStrToEnum(String color) throws ColorException {
            switch (color.toLowerCase()) {
                case "blue":
                    return Color.Blue;
                case "red":
                    return Color.Red;
                case "white":
                    return Color.White;
                default:
                    throw new ColorException("Input only color blue, red or white");
            }
        }

        private Type typeStrToEnum(String type) throws TypeException {
            switch (type.toLowerCase()) {
                case "daffodi":
                    return Type.Daffodi;
                case "lily":
                    return Type.Lily;
                case "daisy":
                    return Type.Daisy;
                case "tulip":
                    return Type.Tulip;
                case "Poppy":
                    return Type.Poppy;
                case "rose":
                    return Type.Rose;
                case "bluebell":
                    return Type.Bluebell;
                default:
                    throw new TypeException("Input only type daffodi, lily, daisy, tulip, poppy, rose or bluebell");
            }
        }
        @Override
        public String toString() {
            return "Plant [size=" + size + ", color=" + color.toString() + ", type=" + type.toString() + "]";
        }
    }










