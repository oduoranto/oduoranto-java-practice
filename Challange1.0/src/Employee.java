public class Employee extends Worker{

    private long empoloyeeId;
    private String hireDate;
    public Employee(){

    }

    public Employee(String name, String birthdate, String enddate, long empoloyeeId, String hireDate) {
        super(name, birthdate, enddate);
        this.empoloyeeId = empoloyeeId;
        this.hireDate = hireDate;
    }
}
