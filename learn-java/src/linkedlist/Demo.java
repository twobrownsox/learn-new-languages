package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<String>();
        addInOrder(placeToVisit,"Sydney");
        addInOrder(placeToVisit,"Melbourne");
        addInOrder(placeToVisit,"Brisbane");
        addInOrder(placeToVisit,"Perth");
        addInOrder(placeToVisit,"Canberra");
        addInOrder(placeToVisit,"Adelaide");
        addInOrder(placeToVisit,"Darwin");

        addInOrder(placeToVisit,"Alice Springs");
        addInOrder(placeToVisit,"Darwin");
        printList(placeToVisit);
        visit(placeToVisit);

//        placeToVisit.add("Sydney");
//        placeToVisit.add("Melbourne");
//        placeToVisit.add("Brisbane");
//        placeToVisit.add("Perth");
//        placeToVisit.add("Canberra");
//        placeToVisit.add("Adelaide");
//        placeToVisit.add("Darwin");
//        printList(placeToVisit);

//        placeToVisit.add(1,"Alice Springs"); // added to index 1
//        printList(placeToVisit);

//        placeToVisit.remove(4);
//        printList(placeToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {

        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) { // has next checks if the element i has a pointer to another element in the linked list
            System.out.println("Visiting " + i.next()); // next returns the current value then iterates to the next value
        }
        System.out.println("===================");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); // list iterator used to allow comparison of elements
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) { // equal, do not add
                System.out.println(newCity + " already exists as a destination");
                return false;
            } else if(comparison > 0) {
                // new city should be added before this one
                // Brisbane -> Adelaide (adelaide comes before Brisbane alphabetically)
                stringListIterator.previous(); // go back to the previous index entry
                stringListIterator.add(newCity); // add the new city before this one
                return true;
            } else {
                // move on to the next city. nothing to do here as .next() already called above
            }
        }
        stringListIterator.add(newCity); // add the new city before this one
        return true;
    }

    public static void visit(LinkedList cities) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (Vation) over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached end of the list");
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

   private static void printMenu() {
       System.out.println("Available ations:\npress ");
       System.out.println(" 0 - to quit\n" +
                    "1 - go to next city\n" +
                    "2 - go to previous city\n" +
                    "3 - print menu options");
   }

}
