package referencesvsvaluetypes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // basic types (ints, boolean, doubles etc are value types. i.e. a variable directly holds the value, not a reference to the value
        int myValue = 10;
        int anotherValue = myValue;
        System.out.println("myValue = " + myValue);
        System.out.println("anotherValue = " + anotherValue);

        anotherValue++;
        System.out.println("myValue = " + myValue);
        System.out.println("anotherValue = " + anotherValue); // now gives 11 and myValue is unchanged as the variables are copies of the the value, not references to the same value

        // new keyword means we are creating a new object (reference)
        int[] myIntArray = new int[5]; // myIntArray holds a reference to the object in memory, not the actual array
        int[] anotherArray = myIntArray; // 2nd reference pointing to the same reference (no new keyword)
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1; // updates both variables as they contain the same address to the 1 actual array in memory
        System.out.println("after myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {1,2,3,4,5}; // creates a new reference
        modifyArray(myIntArray); // array is passed as a reference when calling method
        System.out.println("after method call myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after method call anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
    }

}
