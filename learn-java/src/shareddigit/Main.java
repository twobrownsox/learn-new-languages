package shareddigit;

public class Main {

    public static void main(String[] args) {
        testSharedDigitHasSharedDigit(12,23);
        testSharedDigitHasSharedDigit(9,99);
        testSharedDigitHasSharedDigit(15,55);
        testSharedDigitHasSharedDigit(12,55);
        testSharedDigitHasSharedDigit(12,13);
    }

    public static void testSharedDigitHasSharedDigit(int num1, int num2) {
        System.out.println(num1 + " and " + num2 + " have shared digit: "
            + SharedDigit.hasSharedDigit(num1,num2));
    }

}
