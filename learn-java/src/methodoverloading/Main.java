package methodoverloading;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("1",500);
        System.out.println("New score " + newScore);

        newScore = calculateScore(200);
        System.out.println("New score " + newScore);

        newScore = calculateScore();
        System.out.println("New score " + newScore);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

}
