package sumoddrange;

public class Main {

    public static void main(String[] args) {
        testSumOddRangeSumOdd(1,100);
        testSumOddRangeSumOdd(-1,100);
        testSumOddRangeSumOdd(100,100);
        testSumOddRangeSumOdd(13,13);
        testSumOddRangeSumOdd(100,-100);
        testSumOddRangeSumOdd(100,1000);
    }

    public static void testSumOddRangeSumOdd(int start, int end) {
        System.out.println("Sum odd numbers " + start + " to " + end + " = "
                + SumOddRange.sumOdd(start,end));
    }

}
