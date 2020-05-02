package oopmasterchallenge;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Hamburger","Plain White","Beef",2.50);
        hamburger.setAddition1(new Addition("Onions",0.50));
        hamburger.setAddition2(new Addition("Lettuce",0.50));
        System.out.println(hamburger.toString());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken",3.00);
        healthyBurger.setAddition1(new Addition("Tomato",0.30));
        healthyBurger.setAddition2(new Addition("Carrot",0.40));
        healthyBurger.setHealthyAddition1(new Addition("Kale",1.00));
        System.out.println(healthyBurger.toString());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Super Large","Beef",4.50);
        deluxeHamburger.setAddition3(new Addition("Onions",50.0));
        System.out.println(deluxeHamburger.toString());

    }

}
