package Section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumElementChallenge {
    public static void main(String[] args) {
        int[] intArr = readIntegers();
        Arrays101.printElements(intArr);
        int minElement = findMin(intArr);
        System.out.println("Minimum Element is... " + minElement);
    }
    private static int[] readIntegers(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        try {
            input = reader.readLine().split(",");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int[] intArr = new int[input.length];
        for(int i = 0; i < input.length; i++){
            intArr[i] = Integer.parseInt(input[i].trim());
        }
        return intArr;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int el : arr){
            if (el < min){
                min = el;
            }
        }
        return min;
    }
}
