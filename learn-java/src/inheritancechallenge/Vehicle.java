package inheritancechallenge;

public class Vehicle {

    private String name;
    private String size;
    private int direction;
    private int speed;

    public Vehicle(String name, String size, int direction, int speed) {
        this.name = name;
        this.size = size;
        this.direction = direction;
        this.speed = speed;
        System.out.println("name: " + getName() + ", size: " + getSize() + ", direction: " + getDirection() + ", speed: " + getSpeed());
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void steer(int movement) {
        this.direction += movement;
        System.out.println("direction is: " + getDirection());
    }

    public void accelerate(int amount) {
        this.speed =+ amount;
        System.out.println("speed is: " + getSpeed());
    }

    public void decelerate(int amount) {
        this.speed -= amount;
        System.out.println("speed is: " + getSpeed());
    }

}
