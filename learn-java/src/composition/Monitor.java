package composition;

public class Monitor {

    private String model;
    private String maufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String maufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.maufacturer = maufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixedAt(int x, int y, String colour) {
        System.out.println("Drawing pixed at x + " + x + ", y " + y + ", colour " + colour);
    }

}
