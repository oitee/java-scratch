package Section11;

import java.util.ArrayList;
import java.util.Iterator;

public class Store {
    private ArrayList<OrderItem> orders = new ArrayList<>();

    public void addItemToOrder(OrderItem order){
        orders.add(order);
        System.out.println("Added " + order.product().type + " to the list of items");
    }

    public void printOrder(){
        System.out.println("Printing orders...............");
        Iterator iterator = orders.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("________END__________________");
    }
}

