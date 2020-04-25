package inheritancechallenge;

public class Main {

    public static void main(String[] args) {

        Mini mini = new Mini("Mini1","Small");
        mini.accelerate(10);
        mini.steer(-5);
        mini.changeUpGear();
        mini.accelerate(20);
        mini.changeDownGear();
        mini.decelerate(5);

    }

}
