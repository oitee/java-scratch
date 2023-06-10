package Section7;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    SalariedEmployee(String name, String birthdate, long employeeId, String hireDate, double annualSalary, boolean isRetired){
        super(name, birthdate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
        super.collectPay();
        double monthlySalary = annualSalary/12.0;
        if(this.isRetired){
           monthlySalary /= 2;
        }
        return monthlySalary;
    }

    public void retire(){
        terminate("25/03/2023");
        this.isRetired = true;
        System.out.println(this.name + ", with Employee ID: " + this.employeeId + " has retired!");
    }

}
