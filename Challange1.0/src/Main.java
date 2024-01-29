import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


Worker john = new Worker("Radier","25/07/2010");
        System.out.println(  "Age = "+ john.getAge());
        System.out.println("Worker's paycheck = $" + john.collectPay());

        SalariedEmployee anto = new SalariedEmployee("Oduor","11/10/2002",00,"2024",2000.90);
        System.out.println("Age = " + anto.getAge());
        System.out.println( "Worker's paycheck is " + anto.collectPay());



}}