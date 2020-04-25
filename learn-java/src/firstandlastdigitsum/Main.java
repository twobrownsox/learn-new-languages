package firstandlastdigitsum;

public class Main {

    public static void main(String[] args) {
        testFirstLastDigitSumSumFirstAndLastDigit(252);
        testFirstLastDigitSumSumFirstAndLastDigit(257);
        testFirstLastDigitSumSumFirstAndLastDigit(0);
        testFirstLastDigitSumSumFirstAndLastDigit(5);
        testFirstLastDigitSumSumFirstAndLastDigit(-10);
    }

    public static void testFirstLastDigitSumSumFirstAndLastDigit(int number) {
        int sum = FirstLastDigitSum.sumFirstAndLastDigit(number);
        if (sum == -1) {
            System.out.println(number + " - Invalid number");
        } else {
            System.out.println(number + " = " + sum);
        }
    }

}
