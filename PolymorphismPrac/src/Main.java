
public class Main {
    public static void main(String[] args) {


        Car car = new Car("Black");
        System.out.println(car.accelerate());

        Tesla tesla = new Tesla("Telsa Model S",57,272);
        System.out.println(tesla.accelerate());

        VolksWagen volksWagen = new VolksWagen("Golf",36, 6);
        System.out.println(volksWagen.startEngine());
        System.out.println(volksWagen.accelerate());

        Bmw bmw = new Bmw("Bmw X5", 50,8);
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
    }
}