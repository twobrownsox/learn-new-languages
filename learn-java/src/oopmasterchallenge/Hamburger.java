package oopmasterchallenge;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public double getTotalPrice() {
        double totalPrice = this.price;
        if (addition1 != null) {
            totalPrice += addition1.getPrice();
        }
        if (addition2 != null) {
            totalPrice += addition2.getPrice();
        }
        if (addition3 != null) {
            totalPrice += addition3.getPrice();
        }
        if (addition4 != null) {
            totalPrice += addition4.getPrice();
        }
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void setAddition1(Addition addition) {
        this.addition1 = addition;
    }

    public void setAddition2(Addition addition) {
        this.addition2 = addition;
    }

    public void setAddition3(Addition addition) {
        this.addition3 = addition;
    }

    public void setAddition4(Addition addition) {
        this.addition4 = addition;
    }

    public String toString() {
        String desc;
        desc = getName()
                +" - Roll: " + breadRollType
                + ", Meat: " + meat;
        if (addition1 != null) {
            desc += ", Addition 1: " + addition1.getName();
        }
        if (addition2 != null) {
            desc += ", Addition 2: " + addition2.getName();
        }
        if (addition3 != null) {
            desc += ", Addition 3: " + addition3.getName();
        }
        if (addition4 != null) {
            desc += ", Addition 4: " + addition4.getName();
        }
        desc += ", Price: " + getTotalPrice();
        return desc;
    }

}
