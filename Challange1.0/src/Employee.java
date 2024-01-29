public class Employee extends Worker{

    private long empoloyeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String name, String birthdate,  long empoloyeeId, String hireDate) {
        super(name, birthdate);
        this.empoloyeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }
}
