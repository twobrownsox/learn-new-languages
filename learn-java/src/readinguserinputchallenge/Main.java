package readinguserinputchallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int numberIn = scanner.nextInt();
                sum += numberIn;
                counter++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key) - remove content from input
        }
        System.out.println("Sum = " + sum);

        scanner.close();

    }
    
}
