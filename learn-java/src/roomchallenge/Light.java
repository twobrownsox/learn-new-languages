package roomchallenge;

public class Light {

    private int power;
    private String colour;
    private boolean on;

    public Light(int power, String colour) {
        this.power = power;
        this.colour = colour;
        this.on = false;
    }

    public void turnOn() {
        if (!this.on) {
            this.on = true;
        }
    }

    public void turnOff() {
        if(this.on) {
            this.on = false;
        }
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
