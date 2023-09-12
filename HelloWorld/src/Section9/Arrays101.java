package Section9;

import java.util.Arrays;
import java.util.Random;

public class Arrays101 {
    public static void main(String[] args) {
        int[] firstArr = generateRandomArray(10);
        printElements(firstArr);
        Arrays.sort(firstArr);
        printElements(firstArr);
        System.out.println();

        int[] secondArr = new int[10];
        printElements(secondArr);
        Arrays.fill(secondArr, 100);
        printElements(secondArr);
        System.out.println();

        int[] thirdArr = generateRandomArray(10);
        int[] fourthArr = Arrays.copyOf(thirdArr, 10);
        printElements(thirdArr);
        printElements(fourthArr);
        System.out.println();
        Arrays.sort(thirdArr);
        printElements(thirdArr);
        printElements(fourthArr);
        System.out.println();

        //Trying out binary search using String array
        String[] stringArr = new String[]{"Claire", "Alice", "Earl", "Bob", "Dick"};
        Arrays.sort(stringArr);
        System.out.println("Looking for an existent element in an array using binary search....");
        System.out.println(Arrays.binarySearch(stringArr, "Dick"));
        System.out.println("Looking for NON existent element in an array using binary search....");
        System.out.println(Arrays.binarySearch(stringArr, "Zach"));
        System.out.println();

        int[] intArr1 = new int[]{1, 2, 3, 4, 5};
        int[] intArr2 = new int[]{1, 2, 3, 4, 5};
        if(Arrays.equals(intArr1, intArr2)){
            System.out.println("Arrays are equal");
        } else{
            System.out.println("Arrays are not equal");
        }
        System.out.println();
    }
    public static int[] generateRandomArray(int l){
        Random random = new Random();
        int [] randomArray = new int[l];
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    public static void printElements(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}