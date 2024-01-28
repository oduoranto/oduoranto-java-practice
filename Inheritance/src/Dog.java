public class Dog extends Animal {

    private String tailType;
    private String dogType;

    public Dog(String type, String size, double weight, String tailType, String dogType) {
        super(type, (weight< 15? "small": (weight < 35 ? "medium" : "large")),weight);
        this.tailType = tailType;
        this.dogType = dogType;
    }


   public void move(String speed){
       System.out.println( dogType + " is running");
   }
    public void makeNoise(){
        System.out.println( dogType + " is barking");
    }
public void sizeOfAnimal(){
    System.out.println(size);
}
    @Override
    public String toString() {
        return "Dog{" +
                "tailType='" + tailType + '\'' +
                ", dogType='" + dogType + '\'' +
                "} " + super.toString();
    }
}
