package Section7;

public class ClassesChallenge {
    public static void main(String[] args) {
        Account aliceAcc = new Account("1234", "Alice", "abc@gmail.com", "+91 980022");

        aliceAcc.withdrawFunds(100);
        aliceAcc.depositFunds(1000);
        aliceAcc.withdrawFunds(100);
        aliceAcc.depositFunds(1000);
        aliceAcc.depositFunds(-100);
        aliceAcc.depositFunds(-1000);
        aliceAcc.withdrawFunds(10);

        Account bobAcc = new Account("Bob", "def@gmail.com");
        bobAcc.withdrawFunds(1100);
        bobAcc.depositFunds(11000);
        bobAcc.withdrawFunds(1100);
        bobAcc.depositFunds(11000);
        bobAcc.depositFunds(-1100);
        bobAcc.depositFunds(-11000);
        bobAcc.withdrawFunds(110);
        System.out.println(bobAcc);
    }
}


