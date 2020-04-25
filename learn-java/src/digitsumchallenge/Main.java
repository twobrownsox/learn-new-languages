package digitsumchallenge;

public class Main {

    public static void main(String[] args) {
        testSumDigits(-100);
        testSumDigits(1);
        testSumDigits(9);
        testSumDigits(15);
        testSumDigits(156);
        testSumDigits(1056);
        testSumDigits(123456);
        testSumDigits(12345678);
    }

    public static int sumDigits(int number) {
        if (number > 9) {

            int unitNumber = number%10; // extract least significant digit
            int tensNumber = number/10; // extract remaining number (decimal removed as type is int)
            int sum = unitNumber;

            while(String.valueOf(tensNumber).length() > 1) {
                unitNumber = tensNumber%10;
                tensNumber = tensNumber/10;
                sum += unitNumber;
            }
            sum += tensNumber;
            return sum;

        } else {
            return -1;
        }
    }

    public static int sumDigitsAlt(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number >0) {
            int digit = number % 10; // extract least significant digit
            sum += digit;
            number /= 10; // drop least significant digit
        }
        return sum;

    }

    public static void testSumDigits(int number) {
        int sum = sumDigitsAlt(number);
        if (sum == -1) {
            System.out.println(number + " - Invalid number");
        } else {
            System.out.println(number + " total: " + sum);
        }
    }

}
