package Section6;

public class ForLoopExercise {
    public static void main(String[] args) {
        System.out.println("is 5 prime number: " + isPrime(5));
        System.out.println("is 6 prime number: " + isPrime(6));
        printNextThreePrime(100);
    }

    public static boolean isPrime(int n){
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++){
            int res = n % i;
            if(res == 0){
                return false;
            }
        }
        return true;
    }

    public static void printNextThreePrime(int n){
        int counter = 0;
        for (int i = n; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a Prime Number");
                counter++;
            }
            if (counter >= 3) {
                return;
            }
        }
    }
}
