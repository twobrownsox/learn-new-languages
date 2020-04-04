package byteshortintlong;

public class Main {
    public static void main(String[] args) {

//            width = 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

//            width = 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

//            width = 32
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxintValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxintValue);
        System.out.println("Busted MAX value= " + (myMaxintValue+1));
        System.out.println("Busted MIN vale = " + (myMinIntValue-1));

//            width = 64 (value = 2 power 64)
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);
        long biglLongLiteralValue = 2_147_483_647_234L;
        System.out.println("bigLongLiteralValue = " + biglLongLiteralValue);

        int myIntValue = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2 );
        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}
