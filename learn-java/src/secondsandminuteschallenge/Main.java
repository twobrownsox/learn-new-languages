package secondsandminuteschallenge;

public class Main {

    private static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {
        testGetDurationString(70,59);
        testGetDurationString(100);
        testGetDurationString(61,0);
        testGetDurationString(3602);
        testGetDurationString(-41);
    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes >= 0) && (seconds >= 0) && (seconds <= 59)) {

            int hours = minutes/60;
            int remainingMinutes = minutes % 60;

            String strHours = (hours < 10) ? "0" + hours + "h" : hours + "h";
            String strMinutes = (remainingMinutes < 10) ? "0" + remainingMinutes + "m" : remainingMinutes + "m";
            String strSeconds = (seconds < 10) ? "0" + seconds + "s" : seconds + "s";

            return strHours + " " + strMinutes + " " + strSeconds;

        } else {

            return INVALID_VALUE;

        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds/60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes,remainingSeconds);
        } else {
            return INVALID_VALUE;
        }
    }

    public static void testGetDurationString(int minutes, int seconds ) {
        System.out.println(minutes + "m " + seconds + "s = " + getDurationString(minutes,seconds));
    }

    public static void testGetDurationString(int seconds ) {
        System.out.println(seconds + "s = " + getDurationString(seconds));
    }

}
