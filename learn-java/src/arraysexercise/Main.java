package arraysexercise;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] myIntArray = new int[10]; // assigned 10 elements in the array
//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; // assigned 10 elements in the array

//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50; // 6th element as starts at 0
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);

//        int[] myIntArray = new int[25];
////        int[] myIntArray = new int[30]; //ArrayOutOfBoundsException
//        for (int i=0; i<myIntArray.length; i++) {
//            myIntArray[i] = i*10;
//        }
//        printArray(myIntArray); // pass the whole array

        // example of using arrays with user input
        int[] myIntegers = getIntegers(5);
        for (int i=0; i<myIntegers.length; i++) {
            System.out.println("Number " + i + " = " + myIntegers[i]);
        }
        System.out.println("Average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values\r");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage (int[] array) {
        int sum = 0;
        for (int i=1; i<array.length; i++) {
            sum += array[i];
        }
        return (double) sum /  (double) array.length;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " = " + array[i]);
        }
    }

}
