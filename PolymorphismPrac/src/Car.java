import java.util.Random;

public class Car {

    private String description;
    Random rand = new Random();
    int random = rand.nextInt(40,150);

    public Car(String description) {
        this.description = description;
    }

    public String startEngine(){
        return "Car -> Starting engine";
    }
    public String accelerate(){
        return "Car -> Accelerating at " + random + "km/hr";
    }
    public String brake(){
        return "Car -> Breaking";
    }
}

class Tesla extends Car{
    private double avgKmPerLitre;
    private int cylinder;

    public Tesla(String description, double avgKmPerLitre, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
    }

    public String startEngine(){
        return "Tesla -> Starting engine";
    }
    public String accelerate(){
        return "Tesla -> Accelerating at " + random + "km/hr";
    }
    public String brake(){
        return "Tesla -> Breaking";
    }
}

class VolksWagen extends  Car{
    private double avgKmPerLitre;
    private int cylinder;

    public VolksWagen(String description, double avgKmPerLitre, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
    }
    public String startEngine(){
        return "VolksWagen -> Starting engine";
    }
    public String accelerate(){
        return "VolksWagen -> Accelerating at " + random + "km/hr";
    }
    public String brake(){
        return "VolksWagen -> Breaking";
    }
}
class Bmw extends Car{
    private double avgKmPerLitre;
    private int batteryPack;

    public Bmw(String description, double avgKmPerLitre, int batteryPack) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batteryPack = batteryPack;
    }

    public String startEngine(){
        return "Bmw -> Starting engine";
    }
    public String accelerate(){
        return "Bmw -> Accelerating at " + random + "km/hr";
    }
    public String brake(){
        return "Bmw -> Breaking";
    }
}
