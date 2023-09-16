package Section10;

import java.util.*;

public class ArrayListChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        getUserInput(list);
        System.out.println("Exited.");
    }
    public static void getUserInput(ArrayList<String> list){
        System.out.println("Available Actions: ");
        System.out.println("0 - to shut down");
        System.out.println("1 - to add items to the list");
        System.out.println("2 - to remove items to the list");
        System.out.print("Enter your number: ");
        switch(scanner.nextLine()){
            case "0" -> System.out.println("Bye...");
            case "1" -> addItems(list);
            case "2" -> removeItems(list);
            default -> System.out.println("Invalid input!!");
        }
    }

    public static void addItems(ArrayList<String> list){
        System.out.println("Please enter list of items to be added in comma separated manner...");
        String[] items = scanner.nextLine().trim().split(",");
        List<String> itemsList = List.of(items);
        list.removeAll(itemsList);
        list.addAll(itemsList);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        getUserInput(list);
    }

    public static void removeItems(ArrayList<String> list){
        System.out.println("Please enter list of items to be removed in comma separated manner...");
        String input = scanner.nextLine();
        String[] items = input.trim().split(",");
        List<String> itemsList = List.of(items);
        list.removeAll(itemsList);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        getUserInput(list);
    }


}
