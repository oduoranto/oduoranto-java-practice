/*
Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
        The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
        Write the following methods (instance methods):
        Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet
*/

public class Calculator {
    private Carpet carpet;
    private Floor floor;

    public Calculator(Carpet carpet, Floor floor) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost(){
        return (carpet.getCost() * floor.getArea());
    }

}
