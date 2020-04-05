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

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien"); // only one line is conditionally  executed without a code block

        // always use a code block
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("and I'm scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) { // = != > >= < <=
            System.out.println("You've got the high score");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) { // && -> AND
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
//        if (isCar == true) { // if using single = , true is assigned to isCar, so message is displayed
        if (isCar) { // use short version to avoid using incorrect = or ==
            System.out.println("This is Car");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }

}
