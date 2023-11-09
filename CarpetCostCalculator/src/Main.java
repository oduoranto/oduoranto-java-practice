/*                                 Exercise Description
The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms
        To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet.
        For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters.
        To cover the floor with a carpet that costs $8 per square meter would cost $960.
*/

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(45D,78D);
        System.out.println("The area is " + floor.getArea());
        Carpet carpet = new Carpet(200);
        System.out.println("The cost per m is $" + carpet.getCost());
        Calculator calc = new Calculator(carpet,floor);
        System.out.println("Total cost of the carpet = $" + calc.getTotalCost() );


    }
}