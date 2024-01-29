public class Product {

    private String model;
    private String manufacture;
    private int height;
    private int width;
    private int depth;


    public Product(String model, String manufacture) {
        this.model = model;
        this.manufacture = manufacture;
    }
}
 class Monitor extends Product{
    private int size;
    private String resolution;

     public Monitor(String model, String manufacture) {
         super(model, manufacture);
     }

     public Monitor(String model, String manufacture, int size, String resolution) {
         super(model, manufacture);
         this.size = size;
         this.resolution = resolution;
     }

     public void drawpixelAt(int x, int y, String color){
         System.out.printf("Drawing pixel at %d and  %d with colour %f", x,y,color);
     }
 }
