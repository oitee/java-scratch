package Section11;

public class AbstractClassChallenge {
    public static void main(String[] args) {
        // Products available
        Brush colgateBrush = new Brush(100.12, "Morning Ritual");
        Apple indianApple = new Apple(30.12, "Increasing nutrition");
        Brush sensodyneBrush = new Brush(1000, "Deep cleaning");
        colgateBrush.showDetails();
        indianApple.showDetails();

        // Creating some orders:
        indianApple.printPricedItem(100);
        OrderItem firstOrder = new OrderItem(100, indianApple);
        colgateBrush.printPricedItem(200);
        OrderItem secondOrder = new OrderItem(200, colgateBrush);
        indianApple.printPricedItem(10);
        OrderItem thirdOrder = new OrderItem(10, indianApple);
        System.out.println(firstOrder);
        System.out.println(secondOrder);

        // Adding orders to store
        Store myStore = new Store();
        myStore.addItemToOrder(firstOrder);
        myStore.addItemToOrder(secondOrder);
        myStore.addItemToOrder(thirdOrder);
        myStore.addItemToOrder((new OrderItem(400, colgateBrush)));
        myStore.addItemToOrder((new OrderItem(10, sensodyneBrush)));
        myStore.printOrder();
    }
}
