import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Worker worker = new Worker( "Antony Oduor","2002","Unknown");

        Employee empl = new Employee();
        System.out.println(empl);
        

        SalariedEmployee saEm = new SalariedEmployee("Antony","2000","Unkown",90000001,"2024",4040000,false);
        System.out.println(saEm);
        System.out.println(worker.getAge());
        System.out.println(worker.collectPay());
        saEm.isRetired();


}}