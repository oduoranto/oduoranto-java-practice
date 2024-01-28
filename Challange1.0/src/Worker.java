public class Worker {
    private String name;
    private String birthdate;
    private String enddate;
public Worker(){

}
    public Worker(String name, String birthdate, String enddate) {
        this.name = name;
        this.birthdate = birthdate;
        this.enddate = enddate;
    }
    public int getAge(){
        int age = Integer.parseInt(birthdate);
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
