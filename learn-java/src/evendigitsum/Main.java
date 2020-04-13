package evendigitsum;

public class Main {

    public static void main(String[] args) {
        testEvenDigitSumGetEvenDigitSum(123456789);
        testEvenDigitSumGetEvenDigitSum(252);
        testEvenDigitSumGetEvenDigitSum(-22);
    }

    public static void testEvenDigitSumGetEvenDigitSum(int number) {
        int sum = EvenDigitSum.getEvenDigitSum(number);
        if (sum == -1) {
            System.out.println(number +" = Invalid number");
        } else {
            System.out.println(number + " = " + sum);
        }
    }

}
