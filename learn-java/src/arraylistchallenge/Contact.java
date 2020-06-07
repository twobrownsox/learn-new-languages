package arraylistchallenge;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name,phoneNumber);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + phoneNumber;
    }
}
