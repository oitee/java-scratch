package Section7;

public class Worker {
    protected String name;
    private String birthDate;
    private String endDate;

    Worker(String name, String birthDate){
        this.birthDate = birthDate;
        this.name = name;
    }

    public int getAge(){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;
    }

    public double collectPay(){
        System.out.println("Pay day for " + this.name + "!");
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("Termination will be on " + endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
