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
         toString().formatted(">>Drawing pixel at %d and %d with color %f",x,y,color);
       //  System.out.printf(">>Drawing pixel at %d and  %d with colour %f", x,y,color);
     }
 }
 class ComputerCase extends Product{
    private String powerSupply;


     public ComputerCase(String model, String manufacture) {
         super(model, manufacture);
     }

     public ComputerCase(String model, String manufacture, String powerSupply) {
         super(model, manufacture);
         this.powerSupply = powerSupply;
     }

     public void pressPowerbutton(){
         System.out.println(">>Power Button Pressed.");
     }
 }
 class MotherBoard extends Product{
    private int ramslot;
    private int cardslot;
    private  String bios;



     public MotherBoard(String model, String manufacture) {
         super(model, manufacture);
     }

     public MotherBoard(String model, String manufacture, int ramslot, int cardslot, String bios) {
         super(model, manufacture);
         this.ramslot = ramslot;
         this.cardslot = cardslot;
         this.bios = bios;
     }
     public void loadProgram(String programName){
         System.out.println(">>Loading " + programName + "...");
     }
 }
