package numberpalindrome;

public class Main {

    public static void main(String[] args) {
        testNumberPalindromeIsPalindrome(-1221);
        testNumberPalindromeIsPalindrome(707);
        testNumberPalindromeIsPalindrome(11212);
    }

    public static void testNumberPalindromeIsPalindrome(int number) {
        System.out.println(number + " is palindrome: "
                + NumberPalindrome.isPalindrome(number));
    }

}
