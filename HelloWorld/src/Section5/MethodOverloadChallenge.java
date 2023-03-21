package Section5;

public class MethodOverloadChallenge {
    public static void main(String[] args) {
        System.out.println("100 inches is: " + convertToCentimeters(100) + " cms");
        System.out.println("5ft 7 inches is: " + convertToCentimeters(5, 7) + " cms");
    }

    public static double convertToCentimeters(int height) {
        return height * 2.54d;
    }

    public static double convertToCentimeters(int ft, int inches) {
        int heightInInches = (ft * 12) + inches;
        return convertToCentimeters(heightInInches);
    }
}
