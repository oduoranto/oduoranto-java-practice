public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

}

class Monitor extends Product{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);

    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at  "+ x + ", " + y+ " in color " + color);
    }
}
class Motherboard extends Product{
    private int ramSlot;
    private int cardSlot;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);

    }

    public Motherboard(String model, String manufacturer, int ramSlot, int cardSlot) {
        super(model, manufacturer);
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
    }

    public void loadProgram(String programName){
        System.out.println(programName + " is loading...");
    }
}
class ComputerCase extends Product{

    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void powerButton(){
        System.out.println("Power button was pressed");
    }
}