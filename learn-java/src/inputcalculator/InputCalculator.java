package inputcalculator;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while(true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                break;
            }
            scanner.nextLine();
        }
        long avg = 0;
        if (count > 0) {
            avg = Math.round((double) sum/count);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();

    }

}
