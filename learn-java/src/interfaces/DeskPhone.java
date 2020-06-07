package interfaces;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does nt have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now rining " + phoneNumber + "on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber) {
            this.isRinging = true;
            System.out.println("Ring ring");
        } else {
            this.isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
