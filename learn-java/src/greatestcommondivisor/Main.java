package greatestcommondivisor;

public class Main {

    public static void main(String[] args) {
        testGreatestCommonDivisorGetGreatestCommonDivisor(25,15);
        testGreatestCommonDivisorGetGreatestCommonDivisor(12,30);
        testGreatestCommonDivisorGetGreatestCommonDivisor(9,18);
        testGreatestCommonDivisorGetGreatestCommonDivisor(81,153);
    }

    public static void testGreatestCommonDivisorGetGreatestCommonDivisor(int first, int second) {
        int divisor = GreatestCommonDivisor.getGreatestCommonDivisor(first, second);
        if (divisor == -1) {
            System.out.println(first + ", " + second + " - Invalid values");
        } else {
            System.out.println(first + ", " + second + " common divisor: " + divisor);
        }
    }

}
