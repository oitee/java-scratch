package Section10;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList101 {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Dhaka");
        placesToVisit.add(0, "Delhi");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        removeElements(placesToVisit);
        addMoreElements(placesToVisit);
        printItinerary(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        System.out.println("Adding elements...");
        list.addFirst("Kolkata");
        list.addLast("Bombay");
        System.out.println(list);

        //Queue Methods
        System.out.println("Queue operations...");
        list.offer("Moscow");
        System.out.println(list);
        list.offerLast("LA");
        list.offerFirst("Chennai");
        System.out.println(list);

        //Stack method
        list.push("Bangalore");
        System.out.println(list);

    }

    private static void removeElements(LinkedList<String> list) {
        System.out.println("Removing elements...");
        list.remove("Moscow");
        list.remove(1);
        list.remove();
        System.out.println(list);

        //Queue methods
        list.poll();//Removes first element
        list.pollFirst();// Removes first element
        list.pollLast();// Removes last element
        System.out.println(list);

        //Stack methods
        list.push("Istanbul");
        list.push("Pondicherry");
        System.out.println(list);
        list.pop();
        System.out.println(list);
    }

    private static void printItinerary(LinkedList<String> list) {
        System.out.println("Using traditional For Loop to print elements...");
        System.out.println();

        System.out.println("Trip begins at: " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i - 1) + " -> " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
        System.out.println("Printing elements using ListIterator...");
        System.out.println();

        System.out.println("Trip begins at: " + list.getFirst());
        ListIterator<String> listIterator = list.listIterator(1);
        String previousTown = list.getFirst();
        while (listIterator.hasNext()) {
            String town = listIterator.next();
            System.out.println(previousTown + " -> " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at: " + list.getLast());

        System.out.println("Going reverse using ListIterator...");
        while (listIterator.hasPrevious()) {
            String town = listIterator.previous();
            System.out.print(town + " ");
        }
    }
}
