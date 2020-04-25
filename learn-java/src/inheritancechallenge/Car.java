package inheritancechallenge;

public class Car extends Vehicle {

    private int gear;

    public Car(String name, String size) {
        super(name, size,0, 0);
        this.gear = 1;
    }

    public int getGear() {
        return gear;
    }

    public void changeUpGear() {
        this.gear++;
        System.out.println("gear is: " + getGear());
    }

    public void changeDownGear() {
        this.gear--;
        System.out.println("gear is: " + getGear());
    }

}
