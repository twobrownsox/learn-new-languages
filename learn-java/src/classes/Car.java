package classes;

public class Car {

    // state - defined as fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown model";
        }
    }

    public String getModel() {
        return this.model;
    }

}
