package methods;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        gameOver = false;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Player 1",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Player 2",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Player 3",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Player 4",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Player 5",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Player 6",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Player 7",highScorePosition);

    }

    public static int calculateScore( boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition ( String playerName, int position ) {
        System.out.println(
                playerName + " managed to get to position "
                + position + " on the high score table");
    }

    public static int calculateHighScorePosition ( int score ) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; // assuming position 4 will be returned by default
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

}
