package operators;

public class Main {

    public static void main(String[] args) {

        // plus
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        // minus
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        // multiply by
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // divide by
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // modulus
        result = result % 3; // the remainder of (4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++;
        System.out.println("1 + 1 = " + result); // 1 + 1 = 2

        // result = result - 1;
        result--;
        System.out.println("2 - 1  = " + result); // 2 - 1 = 1

        // result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result); // 1 + 2 = 3

        // result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result); // 3 * 10 = 30

        // result = result / 3;
        result /= 3;
        System.out.println("30 / 3 = " + result); // 30 / 3 = 10

        // result = result - 2;
        result -= 2;
        System.out.println("10 - 2 = " + result); // 10 - 2 = 8

        // result = result % 3;
        result %= 3;
        System.out.println("8 % 3 = " + result); // 8 % 3 = 2

    }

}
