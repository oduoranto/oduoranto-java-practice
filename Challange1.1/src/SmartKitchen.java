import java.util.Scanner;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigirator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigirator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }
    private void addWater(){
        System.out.println(">>Adding water to the dishWasher.");

    }
    private void pourMilk(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Black coffee or 2. White coffee >> ");
        int choice = sc.nextInt();
        if(choice == 1){
            brewMaster.brewCoffee();
        }
        else if(choice ==2){
            System.out.println(">>Pouring milk.");
            brewMaster.brewCoffee();
        }else{
            System.out.println(">>No choice");
        }
    }
    private void loadDishWasher(){
        dishWasher.doDishes();

    }
    private void setKitchenState(boolean coffee,boolean dishes, boolean  fridge){
        dishWasher.doDishes();
        brewMaster.brewCoffee();
        iceBox.orderFood();

    }
    public void doKitchenWork(){
        loadDishWasher();
        System.out.println("______");
        pourMilk();
        System.out.println("______");
        setKitchenState(true,false,false);
        System.out.println("______");
        addWater();

    }
}
