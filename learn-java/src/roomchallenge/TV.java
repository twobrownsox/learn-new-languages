package roomchallenge;

public class TV {

    private String make;
    private String model;
    private int size;
    private boolean on;

    public TV(String make, String model, int size) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.on = false;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public boolean isOn() {
        return on;
    }
}
