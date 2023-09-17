package Section10;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Place(String town, int distance) {
    @Override
    public String toString() {
        return "|| " + town + ", " + distance + " || ";
    }
}

public class LinkedListChallenge {
    //Create a LinkedList of places
    private static LinkedList<Place> listOfPlaces = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Creating LinkedList of places
        createList();
        showMenu();

    }

    private static void createList() {
        boolean flag = true;
        String input;
        int distance;

        while (flag) {
            System.out.print("Please enter name of a town; Press 100 to exit : ");
            input = scanner.nextLine().trim();
            if (input.equals("100")) {
                flag = false;
            } else {
                distance = (int) (Math.random() * 1000);
                Place town = new Place(input, distance);
                addPlace(town);
                System.out.print("");
            }
        }
    }

    private static void addPlace(Place place) {
        int index = 0;
        for (Place p : listOfPlaces) {
            if (place.distance() <= p.distance()) {
                listOfPlaces.add(index, place);
                return;
            }
            index++;
        }
        listOfPlaces.add(index, place);
    }

    private static void showMenu() {

        System.out.print("""
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit""");
        ListIterator<Place> iterator = listOfPlaces.listIterator();
        boolean flag = true;
        boolean forward = true;
        while (flag) {
            String input = scanner.nextLine();
            switch (input.toUpperCase().charAt(0)) {
                case 'F' -> {
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    } else {
                        System.out.println("This is the end!!");
                    }
                }
                case 'B' -> {
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    } else {
                        System.out.println("This is the very beginning!!");
                    }
                }
                case 'L' -> System.out.println(listOfPlaces);
                case 'M' -> System.out.print("""
                        (F)orward
                        (B)ackward
                        (L)ist places
                        (M)enu
                        (Q)uit""");
                case 'Q' -> flag = false;
                default -> {
                    System.out.println("Invalid Response!");
                    flag = false;
                }
            }
        }
    }
}
