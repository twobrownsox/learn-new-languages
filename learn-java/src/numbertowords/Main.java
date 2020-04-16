package numbertowords;

public class Main {

    public static void main(String[] args) {
        testNumberToWordsGetDigitCount(0);
        testNumberToWordsGetDigitCount(123);
        testNumberToWordsGetDigitCount(-12);
        testNumberToWordsGetDigitCount(5200);
        testNumberToWordsReverse(-121);
        testNumberToWordsReverse(1212);
        testNumberToWordsReverse(1234);
        testNumberToWordsReverse(100);
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
    }


    public static void testNumberToWordsReverse(int number) {
        System.out.println(number + " reversed: " + NumberToWords.reverse(number));
    }

    public static void testNumberToWordsGetDigitCount(int number) {
        System.out.println(number + " digit count: " + NumberToWords.getDigitCount(number));
    }

}
