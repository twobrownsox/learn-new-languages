package perfectnumber;

public class Main {

    public static void main(String[] args) {
        testPerfectNumberisPerfectNumber(6);
        testPerfectNumberisPerfectNumber(28);
        testPerfectNumberisPerfectNumber(5);
        testPerfectNumberisPerfectNumber(-1);
    }

    public static void testPerfectNumberisPerfectNumber(int number) {
        System.out.println(number + " is a perfect number: " + PerfectNumber.isPerfectNumber(number));
    }

}
