public class Animal {

    private String type;
    protected String size;
    private double weight;

    public Animal() {

    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void move (String speed){
        System.out.println("Animal moving");
    }

    public void makeNoise(){
        System.out.println("Animal make some kind of noise");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
