package Section11;

abstract public class ProductForSale {
    public String type;
    public double price;
    public String description;

    public void printPricedItem(int quantity) {
        System.out.println("_________________");
        double total = price * quantity;
        System.out.println(type + " x " + quantity + "=" + "INR " + total);
        System.out.println("_________________");
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public abstract void showDetails();
}

class Brush extends ProductForSale{

    public Brush(double price, String description){
        this.type = "Brush";
        this.price = price;
        this.description = description;

    }
    @Override
    public void showDetails() {
        System.out.println(type + " is a grocery item");
        System.out.println(type + " is on sale");
        System.out.println(type + " is good for " + description);
    }
}

class Apple extends ProductForSale{

    public Apple(double price, String description){
        this.type = "Apple";
        this.price = price;
        this.description = description;

    }
    @Override
    public void showDetails() {
        System.out.println(type + " is a perishable item");
        System.out.println(type + " is out of stock");
        System.out.println(type + " is good for " + description);
    }
}

record OrderItem(int quantity, ProductForSale product){
    @Override
    public String toString() {
        return "|| " + product.type + "..." + product.description + "... \n INR " + product.price + " "  + " * " + quantity + " ||";
    }
}
