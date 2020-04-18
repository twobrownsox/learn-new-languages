package largestprime;

public class Main {

    public static void main(String[] args) {
        testLargetsPrimeGetLargetsPrime(21);
        testLargetsPrimeGetLargetsPrime(217);
        testLargetsPrimeGetLargetsPrime(0);
        testLargetsPrimeGetLargetsPrime(45);
        testLargetsPrimeGetLargetsPrime(-1);
        testLargetsPrimeGetLargetsPrime(3);
        testLargetsPrimeGetLargetsPrime(4);
        testLargetsPrimeGetLargetsPrime(5);
        testLargetsPrimeGetLargetsPrime(6);
        testLargetsPrimeGetLargetsPrime(7);
        testLargetsPrimeGetLargetsPrime(8);
        testLargetsPrimeGetLargetsPrime(9);
    }

    public static void testLargetsPrimeGetLargetsPrime(int number) {
        System.out.println(number + " largest prime: "
                + LargestPrime.getLargestPrime(number));
    }

}
