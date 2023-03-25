package Section6;

public class SwitchExercise {
    public static void main(String[] args) {
        printNatoAlphabet('A');
        printNatoAlphabet('B');
        printNatoAlphabet('Z');
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
    }
    public static void printNatoAlphabet(char character){
        switch(character){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Letter " + character + " not found");
        }
    }
    public static void printDayOfWeek(int day){
        switch (day){
            case 0 -> System.out.println(day + " is Monday");
            case 1 -> System.out.println(day +  " is Tuesday");
            case 2 -> System.out.println(day + " Wednesday");
            case 3 -> System.out.println(day + " Thursday");
            case 4 -> System.out.println(day + " Friday");
            case 5 -> System.out.println(day + " Saturday");
            case 6 -> System.out.println(day + " Sunday");
            default -> System.out.println(day + " is not a valid day");

        }
    }
}
