package charandboolean;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; // only one character - 2 bytes, 16 bits, width = 16 (unicode)
        char myUnicodeChar = '\u0044'; // unicode-table.com
        System.out.println("myChar = " + myChar);
        System.out.println("myUnicodeChar = " + myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println("myCopyrightChar = " + myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

    }

}
