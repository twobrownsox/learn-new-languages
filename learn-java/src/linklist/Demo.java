package linklist;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<String>();
        placeToVisit.add("Sydney");
        placeToVisit.add("Melbourne");
        placeToVisit.add("Brisbane");
        placeToVisit.add("Perth");
        placeToVisit.add("Canberra");
        placeToVisit.add("Adelaide");
        placeToVisit.add("Darwin");
        printList(placeToVisit);

        placeToVisit.add(1,"Alice Springs"); // added to index 1
        printList(placeToVisit);

        placeToVisit.remove(4);
        printList(placeToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {

        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) { // has next checks if the element i has a pointer to another element in the linked list
            System.out.println("Visiting " + i.next()); // next returns the current value then iterates to the next value
        }
        System.out.println("===================");

    }

    

}
