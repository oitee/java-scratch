package Section5;

public class Main {
    public static void main(String[] args) {
        int score = 100;
        if(score > 1000){
            System.out.println("Score is greater than 1000");
        }
        else if(score > 500){
            System.out.println("Score is greater than 500 but less than 1000");
        }
        else{
            System.out.println("Score is less than 500");
        }
    }
}
