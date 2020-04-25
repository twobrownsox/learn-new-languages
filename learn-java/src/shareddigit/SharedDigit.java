package shareddigit;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        boolean found = false;
        if ((num1 >= 10) && (num1 <= 99) && (num2 >= 10) && (num2 <= 99)) {

            int origNum2 = num2;
            while (num1 > 0) {

                int num1Digit = num1 % 10;
                num1 /= 10;
                num2 = origNum2;
                while (num2 > 0) {

                    int num2Digit = num2 % 10;
                    num2 /= 10;
                    if (num2Digit == num1Digit) {
                        found = true;
                        break;
                    }

                }

                if (found) {
                    break;
                }

            }
            return found;

        } else {

            return false;

        }

    }

}
