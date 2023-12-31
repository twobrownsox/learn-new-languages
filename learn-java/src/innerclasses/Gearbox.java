package innerclasses;

import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGears;
//    private int gearNumber = 0; // rename to prevent "Shadowing" in inner class
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);

        for(int i=0; i<maxGears; i++) {
            addGear(i, i*5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    private void addGear(int number, double ratio) {
        if ((number > 0) && (number <= this.maxGears)) {
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (this.clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.00;
        }
        return revs * gears.get(this.currentGear).getRatio();
    }

    //    public class Gear {
    private class Gear {
        private int gearNumber; // "Shadowing" the gearNumber field in the Gearbox class. This is NOT recommended, so are going to rename Gearbox field to currentGear
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber; // this.gearNumber refers to the field in the inner Gear class, not the Gearbox class
            this.ratio = ratio;
        }

    public double getRatio() {
        return ratio;
    }

    public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}
