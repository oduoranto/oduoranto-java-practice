//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Printer one_0 = new Printer(3,true);
        System.out.println("Pages printed >> " + one_0.printPages(16));
        System.out.println("Toner level >> " + one_0.addToner(23));
        System.out.println("Toner level >> " + one_0.tonerLevel);
    }
}