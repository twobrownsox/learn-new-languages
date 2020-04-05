package floatanddouble;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("myMinFloatValue = " + myMinFloatValue);
        System.out.println("myMaxFloatValue = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("myMinDoubleValue = " + myMinDoubleValue);
        System.out.println("myMaxDoubleValue = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
//        double myDoubleValue = 5d /  3d;
        double myDoubleValue = 5.00 /  3.00;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

//        use a double not a float - modern pc's faster using double and java defaults to double

    }

}
