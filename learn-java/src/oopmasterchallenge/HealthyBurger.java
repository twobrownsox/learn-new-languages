package oopmasterchallenge;

public class HealthyBurger extends Hamburger {

    private Addition healthyAddition1;
    private Addition healthyAddition2;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "Brown Rye", meat, price);
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = super.getTotalPrice();
        if (healthyAddition1 != null) {
            totalPrice += healthyAddition1.getPrice();
        }
        if (healthyAddition2 != null) {
            totalPrice += healthyAddition2.getPrice();
        }
        return totalPrice;
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public void setHealthyAddition1(Addition healthyAddition1) {
        this.healthyAddition1 = healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    public void setHealthyAddition2(Addition healthyAddition2) {
        this.healthyAddition2 = healthyAddition2;
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
        if (getAddition3() != null) {
            desc += ", Addition 3: " + getAddition3().getName();
        }
        if (getAddition4() != null) {
            desc += ", Addition 4: " + getAddition4().getName();
        }
        if (healthyAddition1 != null) {
            desc += ", Healthy Addition 1: " + healthyAddition1.getName();
        }
        if (healthyAddition2 != null) {
            desc += ", Healthy Addition 2: " + healthyAddition2.getName();
        }
        desc += ", Price: " + getTotalPrice();
        return desc;
    }

}
