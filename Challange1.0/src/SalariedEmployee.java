public class SalariedEmployee extends  Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthdate, String enddate, long empoloyeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthdate, enddate, empoloyeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    public void isRetired(){
        System.out.println(isRetired);
    }
}
