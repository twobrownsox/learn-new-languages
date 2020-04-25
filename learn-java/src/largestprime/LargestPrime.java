package largestprime;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        int largestPrimeNumber = -1;
        for (int i=2; i<=number; i++) {
            int remainder = number % i;
            if ((number == i) && (largestPrimeNumber == -1)) {
                largestPrimeNumber = i;
                break;
            } else if ((i<number) && (remainder == 0)) {
                int primeNumber = getLargestPrime(i);
                if (primeNumber == -1) {
                    largestPrimeNumber = i;
                } else {
                    largestPrimeNumber = primeNumber;
                }
            }
        }
        return largestPrimeNumber;

    }

}
