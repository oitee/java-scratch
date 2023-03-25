package Section6;

import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {
        int sum = getSum(5);
        System.out.println("Sum of the 5 integers: " + sum);
    }

    public static int getSum(int n){
        int counter = 1;
        int sum = 0;
        String response;
        Scanner scanner = new Scanner(System.in);
        while(counter <= n){
            System.out.println("Please Enter Number #" + counter);
            try{
                response = scanner.nextLine();
                int currentNumber = Integer.parseInt(response);
                sum += currentNumber;
                counter++;
            } catch (NumberFormatException e){
                System.out.println("Please enter a valid integer");
            }
        }
        return sum;
    }
}
