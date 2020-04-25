package forloop;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00,2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.00,3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.00,4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.00,5.0));

        for(int i=2; i<9; i++){
            System.out.println("10,000 at "+ i + "% interest = "
                    + String.format("%.2f",calculateInterest(10000.00,i)));
        }

        System.out.println("************************");

        for(int i=8; i>=2; i--){
            System.out.println("10,000 at "+ i + "% interest = "
                    + String.format("%.2f",calculateInterest(10000.00,i)));
        }

        System.out.println("************************");

        int count = 0;
        for (int i=1; i<10; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
                if (count >= 3){
                    break;
                }
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount*(interestRate/100));
    }

    public static boolean isPrime(int n) {

        if (n==1) {
            return false;
        }

        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
