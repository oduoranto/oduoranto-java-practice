public class Worker {
    private String name;
    private String birthdate;
    protected String enddate;
public Worker(){

}
    public Worker(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;

    }
    public int getAge(){
        int age = Integer.parseInt(birthdate.substring(6));
        int currentYear = 2024;

        return (currentYear -age);
    }
    public double collectPay(){
        return 99.99;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", enddate='" + enddate + '\'' +
                '}';
    }
}
