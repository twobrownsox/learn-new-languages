package primitivetypeschallenge;

public class Main {

    public static void main(String[] args) {

        byte byteExample = 127;
        short shortExample = 32767;
        int intExample = 2147483647;
        long longExample = 50000L+(10L*(byteExample+shortExample+intExample));
        System.out.println("longExample = " + longExample);

        short shortTotal = (short) (10000 + (10*(byteExample+shortExample+intExample)));
        System.out.println("shortTotal = " + shortTotal);

    }

}
