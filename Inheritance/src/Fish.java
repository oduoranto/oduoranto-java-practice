public class Fish extends  Animal {
    private String typeOfFish;
    private int numberOfFins;


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    public Fish( String typeOfFish, int numberOfFins) {
      //  super(type, (weight < 15 ? "Small" : (weight < 35 ? "Medium": "Large" )), weight);
        this.typeOfFish = typeOfFish;
        this.numberOfFins = numberOfFins;
    }

    public void move(String speed) {

            System.out.println(typeOfFish + " is swimming fast");
    }
        public void sizeOfAnimal(){
            System.out.println(size);
        }

    @Override
    public String toString() {
        return "Fish{" +
                "typeOfFish='" + typeOfFish + '\'' +
                ", numberOfFins=" + numberOfFins +
                "} " + super.toString();
    }
}

