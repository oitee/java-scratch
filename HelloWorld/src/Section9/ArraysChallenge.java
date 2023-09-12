package Section9;

import java.util.Arrays;

public class ArraysChallenge {
    public static void main(String[] args) {
        int arrLength = 10;
        int[] intArr1 = Arrays101.generateRandomArray(arrLength);
        int[] intArr2 = Arrays.copyOf(intArr1, arrLength);

        //Method 1: Sort using library method + reverse the array
        System.out.println("Method 1: Using library method + reversing the array...");
        Arrays101.printElements(intArr1);
        Arrays.sort(intArr1);
        int[] sortedArr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            sortedArr[i] = intArr1[arrLength - i - 1];
        }
        Arrays101.printElements(sortedArr);
        System.out.println();

        // Method 2: Write my own sorting method
        System.out.println("Method 2: Using my own sorting method...");
        Arrays101.printElements(intArr2);
        sortDescending(intArr2);
        Arrays101.printElements(intArr2);
    }

    private static void sortDescending(int[] arr){
        int j;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            j = i;
            while (j >= 0 && j < arr.length - 1 && arr[j] < arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
    }

}
