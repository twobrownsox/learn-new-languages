package autoboxingandunboxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>(); // can do this as can't use primitive types in array lists - has to be a Class

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i =0; i<10; i++) {
            intArrayList.add(Integer.valueOf(i)); // valueOf is Auto-boxing or converting int primitive type into Integer object
        }

        for (int i=0; i<10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // intValue is Unboxing or converting Integer object back into int primitive type
        }

        Integer myIntValue = 56; // Java auto-converts from int to Integer. At compile time, code changed to Integer.valueOf(56) instead of 56 - autoboxing
        int myInt = myIntValue; // Java auto-converts from Integer to int.At compile time, code changed to myIntValue.intValue() - unboxing

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl=0.0; dbl<=10.0; dbl += 0.5) {
//            myDoubleValues.add(Double.valueOf(dbl));
            myDoubleValues.add(dbl); // don't need to explicitly use valueOf as java converts for you (auto-boxing)

        }

        for (int i=0; i<myDoubleValues.size(); i++) {
//            double value = myDoubleValues.get(i).doubleValue();
            double value = myDoubleValues.get(i); // don't need to explitely need to use doubleValue as java converts for you (unboxing)
            System.out.println(i + " --> " + value);
        }

    }

}
