package Section5;

public class MainChallenge {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 5, 800, 100);
        System.out.println("High Score 1: " + highScore);
        System.out.println("High Score 2: " + calculateScore(true, 800, 10000, 200));
    }

    public static int calculateScore(boolean gameOver, int levelCompleted, int score, int bonus){
        if(gameOver){
            score += levelCompleted * bonus + 1000;
        }
        return score;
    }
}
