package innerclasses;

import java.lang.reflect.GenericArrayType;

public class Main {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1,12.3); // Gear is an inner class to Gearbox
//        Gearbox.Gear second = new Gearbox.Gear(2,15.4); // Can't do this as need to have an instance of Gearbox to create a Gear instance from
                                                          // as Gear is an inner class of Gearbox
//        Gearbox.Gear third = new mcLaren.Gear(3,17.8); // Also can't do this as have to use the instance.new syntax to create new instance of inner class
        System.out.println(first.driveSpeed(1000));

        // makes more sense to make inner class private and have the outer class create instances of the inner class

    }

}
