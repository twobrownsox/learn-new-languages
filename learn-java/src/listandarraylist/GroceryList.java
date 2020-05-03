package listandarraylist;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items");
        for (int i=0; i<groceryList.size(); i++) {
            System.out.println((i) + ", " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + position + " has been modified to " + newItem);
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(theItem + " removed");

    }

}
