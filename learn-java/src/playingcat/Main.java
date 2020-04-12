package playingcat;

public class Main {

    public static void main(String[] args) {
        testPlayingCatIsCatPlaying(true,10);
        testPlayingCatIsCatPlaying(false,36);
        testPlayingCatIsCatPlaying(false,35);
        testPlayingCatIsCatPlaying(true,44);
    }

    public static void testPlayingCatIsCatPlaying(boolean summer, int temperature) {
        System.out.println("summer: " + summer + ", temperature: " + temperature
                + " - playing: " + PlayingCat.isCatPlaying(summer,temperature));
    }

}
