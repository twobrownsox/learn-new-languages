package operatorchallenge;

public class Main {

    public static void main(String[] args) {

        double doubleOne = 20.00d;
        double doubletwo = 80.00d;

        double sum = (doubleOne+doubletwo)*100.00d;
        System.out.println("sum = " + sum);

        double remainder = sum % 40.00d;
        System.out.println("remainder = " + remainder);

        boolean isZero = (remainder == 0.00d);
        System.out.println("isZero = " + isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }

    }

}
