package Section5;

public class MethodChallenge {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(600);
        String player = "Tim";
        displayHighScorePosition(player, position);
    }

    public static void displayHighScorePosition(String player, int playerPosition) {
        System.out.println(player + " managed to get into position " + playerPosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }
        if(score >= 500){
            return 2;
        }
        if(score >= 100){
            return 3;
        }
        return 4;
    }
}
