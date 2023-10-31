import java.lang.management.MonitorInfo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

Product product = new Product("Pv-100", "Lenovo");
        Monitor monitor = new Monitor("27-INCHbeast","Acer", 43,"2540 x 1440");
        Motherboard mb = new Motherboard("Pv-100","Lenovo",2,3);
        ComputerCase compCase = new ComputerCase("pv-100","Lenovo","Off");
        Pc pc = new Pc("Pv-100", "Lenovo",monitor,mb, compCase);
       // pc.getMonitor().drawPixel(10,10,"red");
pc.powerUp();


    }
}

