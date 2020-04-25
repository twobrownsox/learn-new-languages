package numbertowords;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        for (int i=1; i<= getDigitCount(number); i++) {
            int digit = reverseNumber % 10;
            if (reverseNumber > 0) {
                switch(digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
//                    default:
//                        System.out.println("Invalid Value");
//                        break;
                }
                reverseNumber /= 10;
            } else {
                System.out.println("Zero");
            }
        }

    }

    public static int reverse(int number) {

        boolean negativeNumber = (number < 0);
        if (negativeNumber) {
            number *= -1;
        }

        String strNum = "0";
        while (number > 0) {
            int digit = number % 10;
            strNum += digit;
            number /= 10;
        }

        int retNum = Integer.parseInt(strNum);
        if (negativeNumber) {
            retNum *= -1;
        }
        return retNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(number).length();
    }

}
