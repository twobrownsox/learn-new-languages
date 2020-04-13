package lastdigitchecker;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if ( isValid(num1) && isValid(num2) && isValid(num3) ) {
            int num1Digit = num1 % 10;
            int num2Digit = num2 % 10;
            int num3Digit = num3 % 10;
            return ((num1Digit == num2Digit) || (num1Digit == num3Digit) || (num2Digit == num3Digit));
        } else {
            return false;
        }

    }

    public static boolean isValid(int num) {
        return ((num >= 10) && (num <= 1000));
    }

}
