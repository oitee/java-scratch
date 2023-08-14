package Section8;

public class EncapsulationChallenge {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(50, 0, true);
        System.out.println("Adding 10 to the toner level: " + myPrinter.addToner(10));
        System.out.println("Adding 20 to the toner level: "  + myPrinter.addToner(20));
        System.out.println("Adding 50 to the toner level "  + myPrinter.addToner(20));
        System.out.println("Adding 100 to the toner level "  + myPrinter.addToner(100));
    }
}
