package arraylistchallenge;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts;

    public MobilePhone() {
         this.contacts = new ArrayList<Contact>();
    }

    private int findContact(String name) {
        for (int i=0; i<this.contacts.size(); i++) {
            if (this.contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    public void listContacts() {
        System.out.println("Contacts:");
        for (int i=0; i<contacts.size(); i++) {
            System.out.println("\t" + this.contacts.get(i).toString());
        }
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact) < 0) {
            this.contacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position >= 0) {
            contacts.set(position,newContact);
        }
    }

    public void removeContact(Contact contact) {
        if (this.contacts.indexOf(contact) >= 0) {
            contacts.remove(contact);
        }
    }

    public boolean searchContact(Contact contact) {
        if (this.contacts.indexOf(contact) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public Contact searchContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.contacts.get((position));
        } else {
            return null;
        }
    }

}
