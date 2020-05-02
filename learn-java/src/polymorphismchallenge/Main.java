package polymorphismchallenge;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Car - Engine started");
    }

    public void accelerate() {
        System.out.println("Car - Accelerating");
    }

    public void brake() {
        System.out.println("Car - braking");
    }

}

class Beetle extends Car {

    public Beetle() {
        super("Beetle", 2);
    }

    @Override
    public void accelerate() {
        System.out.println("Beetle - accelerating slowly");
    }

    @Override
    public void brake() {
        System.out.println("Beetle - braking");
    }
}

class Mercedes extends Car {

    public Mercedes() {
        super("Mercedes", 6);
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedes - accelerating fast");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes - braking");
    }

}

class F1 extends Car {

    public F1() {
        super("F1", 12);
    }

    @Override
    public void accelerate() {
        System.out.println("F1 - accelerating really fast");
    }

    @Override
    public void brake() {
        System.out.println("F1 - braking");
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Beetle();
        car.startEngine();
        car.accelerate();
        car.brake();

        car = new Mercedes();
        car.startEngine();
        car.accelerate();
        car.brake();

        car = new F1();
        car.startEngine();
        car.accelerate();
        car.brake();

    }

}
