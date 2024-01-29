//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208","Dell","240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",27,"2540 x 1440");
       // theMonitor.drawpixelAt(4,6,"blue");

        MotherBoard theMotherBoard = new MotherBoard("Bj-200","Asus", 4 , 6, "v2.44");

        MyPc pc = new MyPc("2208","Dell",theMonitor, theCase, theMotherBoard);
        pc.powerUp();

    }
}