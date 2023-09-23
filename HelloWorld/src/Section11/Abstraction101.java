package Section11;

public class Abstraction101 {
    public static void main(String[] args) {
        Dog dog = new Dog("wolf", "Big", 100.00);
        dog.makeNoise();
        doAnimalStuff(dog);
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("fast");

    }
}
