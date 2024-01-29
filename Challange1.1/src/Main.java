//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Refrigirator ref = new Refrigirator(true);

       CoffeeMaker coffee = new CoffeeMaker(true);
       DishWasher dishes = new DishWasher(false);

       SmartKitchen smart = new SmartKitchen(coffee,dishes,ref);
        smart.doKitchenWork();
    }
}