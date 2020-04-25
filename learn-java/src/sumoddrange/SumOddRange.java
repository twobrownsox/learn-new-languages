package sumoddrange;

public class SumOddRange {

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {

        if ((end >= start) && (start >= 0)) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }

}
