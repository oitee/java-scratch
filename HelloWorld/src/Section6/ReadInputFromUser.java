package Section6;
import java.util.Scanner;

public class ReadInputFromUser {
    public static void main(String[] args) {
        int currentYear = 2023;
        String response = getInputFromConsole(currentYear);
        System.out.println(response);

        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int presentYear){
        String name = System.console().readLine("Hi! What's your name? ");
        String birthYearStr = System.console().readLine(name + ", thanks for sharing your name. Can you tell me your year of birth? ");
        int birthYear = Integer.parseInt(birthYearStr);
        int age = presentYear - birthYear;
        return "You are " + age + " years old!";
    }

    public static String getInputFromScanner(int presentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! What's your name?");
        String name = scanner.nextLine();
        String birthYearStr = System.console().readLine(name + ", thanks for sharing your name. Can you tell me your year of birth? ");
        int birthYear = Integer.parseInt(birthYearStr);
        int age = presentYear - birthYear;
        return "You are " + age + " years old!";
    }
}
