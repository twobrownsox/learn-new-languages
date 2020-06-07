package arrayschallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] userValues = getIntegers(7);
        printArray(userValues);
        int[] sortedValues = sortIntegers(userValues);
        printArray(sortedValues);

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers:\r");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Value " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = array; // this is just pointing to the same reference, so updating sortedArray will also update array!
        int[] sortedArray = Arrays.copyOf(array,array.length); // makes a copy of the original array with a different reference
        // although why so we need a new array? why can't we just update the original passed in array?
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    isSorted = false;
                }
            }
        }
        return sortedArray;
    }

}
