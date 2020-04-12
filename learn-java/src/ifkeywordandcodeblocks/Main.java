package ifkeywordandcodeblocks;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score + (levelCompleted * bonus);

        if (gameOver) {
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score + (levelCompleted * bonus);
        System.out.println("Your score was " + finalScore);

    }

}
