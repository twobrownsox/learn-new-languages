package equalsumchecker;

public class Main {

    public static void main(String[] args) {
        testEqualSumChecker(1,1,1);
        testEqualSumChecker(1,1,2);
        testEqualSumChecker(1,-1,0);
    }

    public static void testEqualSumChecker(int val1, int val2, int sum) {
        System.out.println(val1 + " + " + val2 + " = " + sum + ": "
                + EqualSumChecker.hasEqualSum(val1,val2,sum));
    }

}
