package Section11;

public class Dog extends Animal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed == "slow") {
            System.out.println(getExplicitType() + " is walking");
        } else {
            System.out.println(getExplicitType() + " is running");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "wolf") {
            System.out.println("Howl!");
        } else {
            System.out.println("Bark!");
        }
    }
}
