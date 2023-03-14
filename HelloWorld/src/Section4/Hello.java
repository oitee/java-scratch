package Section4;

public class Hello {
    public static void main (String[] args){
        System.out.println("Hello Alice!");
        System.out.println("Hello World");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("Not an Alien");
            System.out.println("Phew!");
        }

        int topScore = 100;
        int secondTopScore = 90;
        if(topScore >= 100 && topScore > secondTopScore){
            System.out.println("Top Score is greater than 100 and greater than second top score!");
        }

        if(topScore > 100 || secondTopScore < 99){
            System.out.println("Either or both of the conditions is true");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("Not a car");
        }

        //Ternary Operator
        String makeOfCar = "BMW";
        boolean isInternational = true;
        String typeOfCar = (makeOfCar == "BMW" && isInternational) ? "well-known and international" : "unknown and/or domestic";
        System.out.println(typeOfCar);

    }
}
