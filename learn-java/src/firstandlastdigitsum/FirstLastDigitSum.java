package firstandlastdigitsum;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;
        int sum = 0;
        while (number > 0) {
            count++;
            int digit = number % 10;
            number /= 10;
            if ((count == 1) && (number == 0)) {
                sum += (digit+digit);
            } else if ((count == 1) || (number == 0)) {
                sum += digit;
            }
        }
        return sum;

    }

}
