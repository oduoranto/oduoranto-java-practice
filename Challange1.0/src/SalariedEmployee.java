public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthdate, long empoloyeeId, String hireDate, double annualSalary) {
        super(name, birthdate, empoloyeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public double collectPay() {
        int paycheck = (int) annualSalary / 26;
        int adjustedPay = isRetired ? (int) (0.9 * paycheck) : paycheck;
        return adjustedPay;
    }

    public void isRetired() {
        isRetired = true;
        this.isRetired = isRetired;
    }
}
