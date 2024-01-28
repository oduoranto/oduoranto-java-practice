//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Croc", "Big", 80.90);
doAnimalStuff(animal,"fast");

Dog german = new Dog("Dog","Small",79,"Fluffy","German Shephard");
doAnimalStuff(german,"Fast");

Fish tilapia = new Fish("Tilapia", " ",65);
doAnimalStuff(tilapia,"Fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.move(speed);
        animal.makeNoise();
        System.out.println(animal.size);
        System.out.println("__________");
        System.out.println();


}}