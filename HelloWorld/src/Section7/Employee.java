package Section7;

public class Employee extends  Worker{
    protected long employeeId;
    private String hireDate;
    private static int employeeCount = 0;

    Employee(String name, String birthdate, long employeeId, String hireDate){
        super(name, birthdate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
        Employee.employeeCount++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}' + super.toString();
    }
}
