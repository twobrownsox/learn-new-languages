package interfaces;

public interface ITelephone {

    // just the signature/specification of the methods, not the implementation
//    public void powewOn(); // public modifier not needed as all methods in an interface are public
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
