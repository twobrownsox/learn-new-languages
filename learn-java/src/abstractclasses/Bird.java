package abstractclasses;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breath in, breathe out as a bird");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
