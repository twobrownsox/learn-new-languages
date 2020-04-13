package lastdigitchecker;

public class Main {

    public static void main(String[] args) {
        testLastDigitCheckerHasSameLastDigit(41,22,71);
        testLastDigitCheckerHasSameLastDigit(23,32,42);
        testLastDigitCheckerHasSameLastDigit(9,99,999);
    }

    public static void testLastDigitCheckerHasSameLastDigit(int num1, int num2, int num3) {
        System.out.println(num1 + ", " + num2 + ", " + num3 + " have shared last digit: "
            + LastDigitChecker.hasSameLastDigit(num1,num2,num3));
    }

}
