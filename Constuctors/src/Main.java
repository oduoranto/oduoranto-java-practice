//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer radier = new Customer("Radier",90000.00,"radier@gmail.com");
        System.out.println("Customer name is " + radier.getName()+ "; Credit limit of $" + radier.getCreditLimit());

        Customer anto = new Customer();
        System.out.println("Customer name is " + anto.getName()+ "; Customer email is "+ anto.getCustomerEmail());

        Customer john = new Customer("John","john@gmail.com");
        System.out.println("Customer name is "+ john.getName()+ "; Credit limit of $" + john.getCreditLimit());
    }
}