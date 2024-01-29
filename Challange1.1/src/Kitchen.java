public class Kitchen {

}
class Refrigirator extends Kitchen{
    protected boolean hasWorkToDo;

    public Refrigirator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        System.out.println(">>Ordering Food..");
    }
}
class DishWasher extends Kitchen{

    protected boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){

        if(hasWorkToDo == true){
        System.out.println(">>Cleaning Dishes..");
    }else{
            System.out.println(">>No Dishes!");
        }
}}
class CoffeeMaker extends Kitchen{
    protected boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo == true){
            System.out.println(">>Brewing coffee! ");
        }else {
            System.out.println(">>Empty");
        }
    }
}
