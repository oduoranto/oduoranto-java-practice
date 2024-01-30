public class Bed {

        private String style;
        private int pillow;
        private int height;
        private int sheet;
        private int quilt;

        public Bed(String style, int pillow, int height, int sheet, int quilt) {
            this.style = style;
            this.pillow = pillow;
            this.height = height;
            this.sheet = sheet;
            this.quilt = quilt;
        }
        public static void make(){
            System.out.println("Bed -> is being made");
        }

        public String getStyle() {
            return style;
        }
    }

