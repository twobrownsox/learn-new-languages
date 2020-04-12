package feetandinchestocentimeters;

public class Main {

    public static void main(String[] args) {
        testCalcFeetAndInchesToCentimeters(6,2);
        testCalcFeetAndInchesToCentimeters(6,14);
        testCalcFeetAndInchesToCentimeters(-1,1);
        testCalcFeetAndInchesToCentimeters(1,-1);
        testCalcFeetAndInchesToCentimeters(0,0);
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ( (feet >= 0) && (inches >= 0) && (inches <= 12) ) {
            int totalInches = (feet*12)+inches;
            return calcFeetAndInchesToCentimeters(totalInches);
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches >= 0) {
            return 2.54 * inches;
        } else {
            return -1;
        }
    }

    public static void testCalcFeetAndInchesToCentimeters(int feet, int inches) {
        double centimeters = calcFeetAndInchesToCentimeters(feet,inches);
        if (centimeters == -1.0) {
            System.out.println(feet + "ft " + inches + "in = Invalid parameters");
        } else {
            System.out.println(feet + "ft " + inches + "in = " + centimeters + "cm");
        }
    }

}
