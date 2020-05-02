package roomchallenge;

public class Room {

    private int width;
    private int length;
    private Door door;
    private Sofa sofa;
    private TV tv;
    private Light light;

    public Room(int width, int length, Door door, Sofa sofa, TV tv, Light light) {
        this.width = width;
        this.length = length;
        this.door = door;
        this.sofa = sofa;
        this.tv = tv;
        this.light = light;
    }

    public void enter() {
        this.door.open();
        this.light.turnOn();
        this.tv.turnOn();
    }

    public void leave() {
        this.tv.turnOff();
        this.door.close();
        this.light.turnOff();
    }

    public void dimLight() {
        this.light.setColour("Dimmed blue");
    }

    public void resetLight() {
        this.light.setColour("Normal white");
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Door getDoor() {
        return door;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public TV getTv() {
        return tv;
    }

    public Light getLight() {
        return light;
    }
}
