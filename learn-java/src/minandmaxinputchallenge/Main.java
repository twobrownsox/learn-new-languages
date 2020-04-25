package minandmaxinputchallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        int min = 0;
//        int max = 0;
//        boolean first = true;
        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                } else if (number < min) {
//                    min = number;
//                } else if (number > max) {
//                    max = number;
//                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input - remove from input
        }
        System.out.println("Min = " + min + ", Max = " + max);

        scanner.close();

    }

}
