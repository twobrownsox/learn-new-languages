package minimumelementchallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many integers do you want to enter?\r");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] values = readIntegers(count);
        System.out.println("Min value is " + findMin(values));
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " Integers:\r");
        int[] values = new int[count];
        for (int i=0; i<count; i++) {
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return values;
    }

    public static int findMin(int[] array) {
//        int min = Integer.MAX_VALUE;
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
