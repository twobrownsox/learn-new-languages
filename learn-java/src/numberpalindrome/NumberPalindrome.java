package numberpalindrome;

import static java.lang.Integer.parseInt;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        if(number < 0) {
            number *= -1;
        }
        int origNumber = number;
        String reverseNumber = "";
        while (number > 0) {
            int digit = number % 10;
            reverseNumber += String.valueOf(digit);
            number /= 10;
        }
        return Integer.parseInt(reverseNumber) == origNumber;
    }

}
