package listandarraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

       boolean quit = false;
       int choice = 0;
       printInstructions();
       while (!quit) {
           System.out.println("Enter your choice:");
           choice = scanner.nextInt();
           scanner.nextLine();

           switch(choice) {
               case 0:
                   printInstructions();
                   break;
               case 1:
                   groceryList.printGroceryList();
                   break;
               case 2:
                   addItem();
                   break;
               case 3:
                   modifyItem();
                   break;
               case 4:
                   removeItem();
                   break;
               case 5:
                   searchForItem();
                   break;
               case 6:
                   processArrayList();
               case 7:
                   quit = true;
                   break;
           }
       }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - Process ArrayList");
        System.out.println("\t 7 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine()); // take all characters until enter is pressed
    }

    public static void modifyItem() {
        System.out.print("Enter item name: ");
        String currentItem = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter replacement item name: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem,newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in out grocery list");
        } else {
            System.out.println(searchItem + " not found in out grocery list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList()); // copy groceryList ArrayList to newArray ArrayList using getter that return ArrayList

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList()); // same as above in one line initialisation

        String[] myArray = new String[groceryList.getGroceryList().size()]; // initialise array to the same length as the ArrayList groceryList
        myArray = groceryList.getGroceryList().toArray(myArray); // convert grocerList ArrayList to an standard array of String

    }

}
