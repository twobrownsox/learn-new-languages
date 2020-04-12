package decimalcomparitor;

public class DecimalComparitor {

    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2) {
        int intVal1 = (int) (val1*1000);
        int intVal2 = (int) (val2*1000);
        return intVal1 == intVal2;
    }

}
