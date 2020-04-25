package diagonalstar;

public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                for (int col = 1; col <= number; col++) {
                    if ((row == 1) || (row == number) || (col == 1) || (col == number) || (row == col) || (col == (number - row + 1))) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.println("");
            }
        }
    }

}
