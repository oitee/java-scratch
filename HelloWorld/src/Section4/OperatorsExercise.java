package Section4;

public class OperatorsExercise {
    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 80.00;
        double res = (num1 + num2) * 100;
        System.out.println("Addition result: " + res);
        double remainder = res % 40.00;
        boolean isNoRemainder = remainder == 0.00d ? true : false;
        System.out.println("No remainder? " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
