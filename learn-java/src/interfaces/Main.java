package interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone; // define object of Interface type
        timsPhone = new DeskPhone(123456); // instantiate the object of class type that implements the interface
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(456789); // can use different type of MobilePhone as both implement same interface
        timsPhone.powerOn();
        timsPhone.callPhone(456789);
        timsPhone.answer();

    }

}
