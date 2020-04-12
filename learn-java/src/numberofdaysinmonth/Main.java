package numberofdaysinmonth;

public class Main {

    public static void main(String[] args) {
        testNumberOfDaysInMonthIsLeapYear(-1600);
        testNumberOfDaysInMonthIsLeapYear(1600);
        testNumberOfDaysInMonthIsLeapYear(2017);
        testNumberOfDaysInMonthIsLeapYear(2000);
        testNumberOfDaysInMonthGetDaysInMonth(1,2020);
        testNumberOfDaysInMonthGetDaysInMonth(2,2020);
        testNumberOfDaysInMonthGetDaysInMonth(2,2018);
        testNumberOfDaysInMonthGetDaysInMonth(-1,2020);
        testNumberOfDaysInMonthGetDaysInMonth(1,-2020);
    }

    public static void testNumberOfDaysInMonthIsLeapYear(int year) {
        System.out.println(year + " is leap year: "
                + NumberOfDaysInMonth.isLeapYear(year));
    }

    public static void testNumberOfDaysInMonthGetDaysInMonth(int month, int year) {
        System.out.println("Days in month " + month + ", year " + year + ": "
                + NumberOfDaysInMonth.getDaysInMonth(month,year));
    }

}
