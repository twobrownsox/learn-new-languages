package strings;

public class Main {

    public static void main(String[] args) {

        // primitive types:
            // byte
            // short
            // int *
            // long
            // float
            // double *
            // char
            // boolean *

        String myString = "This is a string";
        System.out.println("myString = " + myString);

        myString = myString + ", and this is more";
        System.out.println("myString = " + myString);

        myString = myString + " \u00A9 2020";
        System.out.println("myString = " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberString = " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // int converted to a string to + it to  a string
        System.out.println("lastString = " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber; // double converted to a string
        System.out.println("lastString = " + lastString);

    }

}
