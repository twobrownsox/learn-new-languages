package oopmasterchallenge;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger(String roll, String meat, double price) {
        super("Deluxe Hamburger", roll, meat, price);
        super.setAddition1(new Addition("Chips",0.00));
        super.setAddition2(new Addition("Drink",0.00));
    }

    @Override
    public void setAddition1(Addition addition) {
        System.out.println("No more additions allowed for Deluxe Hamburger");
    }

    @Override
    public void setAddition2(Addition addition) {
        System.out.println("No more additions allowed for Deluxe Hamburger");
    }

    @Override
    public void setAddition3(Addition addition) {
        System.out.println("No more additions allowed for Deluxe Hamburger");
    }

    @Override
    public void setAddition4(Addition addition) {
        System.out.println("No more additions allowed for Deluxe Hamburger");
    }

    @Override
    public String toString() {
        String desc;
        desc = getName()
                + " - Roll: " + getBreadRollType()
                + ", Meat: " + getMeat();
        if (getAddition1() != null) {
            desc += ", Addition 1: " + getAddition1().getName();
        }
        if (getAddition2() != null) {
            desc += ", Addition 2: " + getAddition2().getName();
        }
        desc += ", Price: " + getTotalPrice();
        return desc;
    }

}
