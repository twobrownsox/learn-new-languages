package areacalculateor;

public class Main {

    public static void main(String[] args) {
        testArea(5.0);
        testArea(-1);
        testArea(5.0,4.0);
        testArea(-1.0,4.0);
    }

    public static void testArea(double radius) {
        double area = AreaCalculator.area(radius);
        if (area == -1.0) {
            System.out.println("Area of a circle with radius " + radius + " = Invalid parameters");
        } else {
            System.out.println("Area of a circle with radius " + radius + " = " + area);
        }
    }

    public static void testArea(double x, double y) {
        double area = AreaCalculator.area(x,y);
        if (area == -1.0) {
            System.out.println("Area of a rectangle with x: " + x + ", y: " + y + " = Invalid parameters");
        } else {
            System.out.println("Area of a rectangle with x: " + x + ", y: " + y + " = " + area);
        }
    }


}
