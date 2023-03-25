package Section6;

public class SumOfDigitsChallenge {
    public static void main(String[] args) {
        System.out.println("Sum of digits of 123: " + sumDigits(123));
        System.out.println("Sum of digits of 100: " + sumDigits(100));
    }

    public static int sumDigits(int n){
        if(n < 0){
            return -1;
        }
        int sum = 0;

        while(n > 0){
            int lastDigit = n % 10;
            n = n /10;
            sum += lastDigit;
        }
        return sum;
    }
}
