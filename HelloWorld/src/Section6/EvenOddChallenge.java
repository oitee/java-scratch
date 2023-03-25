package Section6;

public class EvenOddChallenge {
    public static void main(String[] args) {
        int number = 5;
        int evenCounter = 0;
        int oddCounter = 0;
        while(number <= 20  && evenCounter <= 5){
            if(isEvenNumber(number)){
                System.out.println(number + " is an even number");
                evenCounter++;
                number++;
                continue;
            }
            number++;
            oddCounter++;
        }
        System.out.println("Seen " + evenCounter + " even numbers" + " and " + oddCounter + " odd numbers");
    }

    public static boolean isEvenNumber(int n){
        return (n % 2 == 0);
    }
}
