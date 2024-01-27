public class Customer {
    private String name;
    private double creditLimit;
    private String customerEmail;

    public Customer(String name, double creditLimit, String customerEmail) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }
    public Customer(){
        this("Antony Oduor", 8999.90, "antonyoduor72@gmail.com");
    }

    public Customer(String name, String customerEmail){
        this(name,100000,customerEmail);

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
