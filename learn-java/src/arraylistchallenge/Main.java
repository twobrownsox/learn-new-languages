package arraylistchallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    private static final String ENTER_NAME = "Enter Name: ";
    private static final String ENTER_PHONE_NUMBER = "Enter Phone Number: ";
    private static final String ENTER_NEW_NAME = "Enter New Name: ";
    private static final String ENTER_NEW_PHONE_NUMBER = "Enter New Phone Number: ";

    public static void main(String[] args) {

        printInstructions();

        boolean quit = false;
        while (!quit) {
            System.out.print("\nPlease enter an Option (0 to print list of options): ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.listContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print List of contacts");
        System.out.println("\t 2 - To Add new contact");
        System.out.println("\t 3 - To Update an existing contact");
        System.out.println("\t 4 - To Remove a contact");
        System.out.println("\t 5 - To Search for a contact");
        System.out.println("\t 6 - To Quit the application");
    }

    private static String getUserInput(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }

    private static void addNewContact() {
        String name = getUserInput(ENTER_NAME);
        String phoneNumber = getUserInput(ENTER_PHONE_NUMBER);
        Contact newContact = Contact.createContact(name,phoneNumber);
        if (mobilePhone.addContact(newContact)) {
            System.out.println("New contact " + newContact.toString() + " added");
        } else {
            System.out.println("Contact " + newContact.toString() + " already exists");
        }
    }

    private static void updateContact() {
        String oldName = getUserInput(ENTER_NAME);
        Contact oldContact = mobilePhone.searchContact(oldName);
        if (oldContact != null) {
            String newName = getUserInput(ENTER_NEW_NAME);
            String newPhoneNumber = getUserInput(ENTER_NEW_PHONE_NUMBER);
            Contact newContact = Contact.createContact(newName,newPhoneNumber);
            mobilePhone.updateContact(oldContact,newContact);
            System.out.println("Contact updated from " + oldContact.toString() + " to " + newContact.toString());
        } else {
            System.out.println("Contact with name " + oldName + " not found");
        }
    }

    private static void removeContact() {
        String name = getUserInput(ENTER_NAME);
        Contact contact = mobilePhone.searchContact(name);
        if (contact != null) {
            mobilePhone.removeContact(contact);
            System.out.println("Contact " + contact.toString() + " removed");
        } else {
            System.out.println("Contact with name " + name + " not found");
        }
    }

    private static void searchContact() {
        String name = getUserInput(ENTER_NAME);
        Contact contact = mobilePhone.searchContact(name);
        if (contact != null) {
            System.out.println("Contact " + contact.toString() + " found");
        } else {
            System.out.println("Contact with name " + name + " not found");
        }
    }

}
