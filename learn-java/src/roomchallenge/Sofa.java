package roomchallenge;

public class Sofa {

    private String name;
    private String model;
    private String colour;
    private int length;

    public Sofa(String name, String model, String colour, int length) {
        this.name = name;
        this.model = model;
        this.colour = colour;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getLength() {
        return length;
    }
}
