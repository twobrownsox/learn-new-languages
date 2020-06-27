package interfaceschallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player tim = new Player("Tim",10,15);
        System.out.println(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);

        Savable werewolf = new Monster("werewolf",20,40);
//        System.out.println(werewolf.getStrength()); // can't do this as getStrength is not implemented in the Savable interface
        System.out.println("Strength = " + ((Monster) werewolf).getStrength()); // have to cast it to a specific class to use the implemented method
                                                                                // or change type from Savable to Monster
                                                                                // use interface type if you want the variable to hold different types of class (that implment the interface)
                                                                                // user the class type if you need to access the methods specifically implemented by that class
                                                                                // generally use interface type over class type
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;

    }

    public static void saveObject(Savable objectToSave) {
        for (int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saveing " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(Savable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
