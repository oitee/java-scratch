package Section7;

public class InheritenceChallenge {
    public static void main(String[] args) {
        Worker aliceWorker = new Worker("Alice", "09/03/2000");
        System.out.println(aliceWorker);
        Employee bobEmployee = new Employee("Bob", "09/06/2002", 112121L, "01/01/2021");
        System.out.println(bobEmployee);

        SalariedEmployee claireSalariedEmployee = new SalariedEmployee("Bob", "09/06/2002", 112121L, "01/01/2021", 1000.0, false);
        System.out.println("Bob to receive: " + claireSalariedEmployee.collectPay());
        claireSalariedEmployee.retire();
        System.out.println("Bob to receive: " + claireSalariedEmployee.collectPay());
        claireSalariedEmployee.terminate("01032023");


    }

}
