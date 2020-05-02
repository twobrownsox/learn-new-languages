package roomchallenge;

public class Door {

    private int height;
    private int width;
    private String colour;

    public Door(int height, int width, String colour) {
        this.height = height;
        this.width = width;
        this.colour = colour;
    }

    public void open(){
        System.out.println("Door opened");
    }

    public void close() {
        System.out.println("Door closed");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }
}
