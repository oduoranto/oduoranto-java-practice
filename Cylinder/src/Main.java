//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cycle circle = new Cycle(24);
        System.out.println ("Area = " + circle.getArea() );

        Cylinder cylinder = new Cylinder(70,500);
        System.out.println("Volume = " + cylinder.getVolume());

    }
}