package leapyear;

public class Main {

    public static void main(String[] args) {
        testLeapYear(-1);
        testLeapYear(10);
        testLeapYear(2000);
        testLeapYear(2014);
        testLeapYear(2020);
        testLeapYear(2024);
    }

    public static void testLeapYear(int year) {
        System.out.println(year + " is leap year: " + LeapYear.isLeapYear(year));
    }

}
