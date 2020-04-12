package teennumberchecker;

public class TeenNumberChecker {

    public static boolean hasTeen (int val1, int val2, int val3) {
        return ( ((val1 >= 13) && (val1 <= 19)) || ((val2 >= 13) && (val2 <= 19)) || ((val3 >= 13) && (val3 <= 19)) );
    }

    public static boolean isTeen(int val) {
        return ((val >= 13) && (val <= 19));
    }

}
