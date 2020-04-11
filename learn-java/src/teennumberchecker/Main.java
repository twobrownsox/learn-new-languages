package teennumberchecker;

public class Main {

    public static void main(String[] args) {

        testTeenNumberCheckerHasTeen(9,99,19);
        testTeenNumberCheckerHasTeen(23,15,42);
        testTeenNumberCheckerHasTeen(22,23,34);

        testTeenNumberCheckerIsTeen(9);
        testTeenNumberCheckerIsTeen(13);

    }

    public static void testTeenNumberCheckerHasTeen( int val1, int val2, int val3 ) {
        System.out.println(val1 + ", " + val2 + ", " + val3 + " has teen: "
                + TeenNumberChecker.hasTeen(val1,val2,val3));
    }

    public static void testTeenNumberCheckerIsTeen(int val) {
        System.out.println(val + " is teen: "
                + TeenNumberChecker.isTeen(val));
    }

}
