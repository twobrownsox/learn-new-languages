package decimalcomparitor;

public class Main {

    public static void main(String[] args) {
        testDecimalComparitor(-3.1756,-3.1756);
        testDecimalComparitor(3.175,3.176);
        testDecimalComparitor(3.0,3.0);
        testDecimalComparitor(-3.123,3.123);
    }

    public static void testDecimalComparitor(double val1, double val2) {
        System.out.println(val1 + " equals " + val2 + ": "
                + DecimalComparitor.areEqualByThreeDecimalPlaces(val1,val2));
    }

}
