package reversearraychallenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] values = {1,2,3,4,5};
        System.out.println("forward: " + Arrays.toString(values));
        reverse(values);
        System.out.println("reversed: " + Arrays.toString(values));

    }

//    public static void reverse(int[] array) {
//        int[] reverseArray = new int[array.length];
//        for (int i=0; i<array.length; i++) {
//            reverseArray[reverseArray.length-1-i] = array[i];
//        }
//        array = reverseArray; // why doesn't this update the reference of array to reverseArray?
//    }

    public static void reverse(int[] array) {
        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        for (int i=0; i<halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }


}
