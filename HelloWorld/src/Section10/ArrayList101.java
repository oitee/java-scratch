package Section10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type){
    @Override
    public String toString() {
        return "||" + name + "-> " + type + "||";
    }
}
public class ArrayList101 {
    public static void main(String[] args) {
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add((new GroceryItem("Apple", "fruit")));
        System.out.println(groceryList);
        groceryList.add(0, (new GroceryItem("Umbrella", "utility")));
        System.out.println(groceryList);
        groceryList.add((new GroceryItem("Shirt", "Fashion")));
        groceryList.add( (new GroceryItem("Pen", "Stationery")));
        groceryList.add((new GroceryItem("Car", "luxury")));
        System.out.println(groceryList);
        groceryList.add(1, (new GroceryItem("NEW", "NA")));
        System.out.println(groceryList);
        groceryList.set(1, (new GroceryItem("cycle", "transporation")));
        System.out.println(groceryList);
        groceryList.remove(1);
        System.out.println(groceryList);
        System.out.println("_____________");

        //Trying out List.of and some built-in methods of ArrayList
        String[] foodItems = new String[]{"Banana", "Cider", "Eel", "Donut", "Apple"};
        List<String> fList = List.of(foodItems);
        System.out.println(fList);
        //This won't work as Lists are immutable
        //fList.add("Cucumber");
        ArrayList<String> foodsArrayList = new ArrayList<>(fList);
        foodsArrayList.add("Cucumber");
        System.out.println(foodsArrayList);
        ArrayList<String> nextArrayList = new ArrayList<>(List.of("ginger", "garlic", "gourd"));
        System.out.println(nextArrayList);
        foodsArrayList.addAll(nextArrayList);
        System.out.println(foodsArrayList);
        System.out.println("Fourth food : " + foodsArrayList.get(3));
        System.out.println("Does the list contain ice cream? " + foodsArrayList.contains("ice cream"));
        System.out.println("Does the list contain gourd? " + foodsArrayList.contains("gourd"));
        //Converting an ArrayList to an array;
        System.out.println(foodsArrayList);
        System.out.println("Converting this ArrayList to an array...");
        System.out.println("Size of this ArrayList is: " + foodsArrayList.size());
        String[] longerArrayFromArrayList = foodsArrayList.toArray(new String[15]);
        System.out.println(Arrays.toString(longerArrayFromArrayList));
        String[] shorterArrayFromArrayList = foodsArrayList.toArray(new String[4]);
        System.out.println(Arrays.toString(shorterArrayFromArrayList));
        System.out.println(foodsArrayList);
        System.out.println("____________________");

        //Trying out sort
        System.out.println(foodsArrayList);
        foodsArrayList.sort(Comparator.naturalOrder());
        System.out.println(foodsArrayList);
        foodsArrayList.sort(Comparator.reverseOrder());
        System.out.println(foodsArrayList);
        System.out.println("____________________");

        //Trying out Arrays.asList();
        String[] animals  = {"tiger", "lion", "elephant"};
        var list = Arrays.asList(animals);
        System.out.println(list);
        // As Arrays.asList returns list of fixed size, it cannot be expanded
        //list.add("peacock");
        list.set(0, "peacock");
        System.out.println("list -> " + list);
        System.out.println("array -> " + Arrays.toString(animals));
        list.sort(Comparator.naturalOrder());
        System.out.println("list -> " + list);
        System.out.println("array -> " + Arrays.toString(animals));
    }
}
