package perfectnumber;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        boolean isPerfect = false;
        int sum = 0;
        for (int i=1; i<= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
            if (sum == number) {
                isPerfect = true;
                break;
            }
        }
        return isPerfect;

    }

}

