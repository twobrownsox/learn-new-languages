package roomchallenge;

public class Main {

    public static void main(String[] args) {

//        Door door = new Door(2,1,"White");
//        Sofa sofa = new Sofa("IKEA","Super Comfy","Blue",3);
//        TV tv = new TV("JVC","Super Big",55);
//        Light light = new Light(100,"White");
//        Room lounge = new Room(3,4,door,sofa,tv,light);
        Room lounge = new Room(4
                , 3
                , new Door(2,1,"White")
                , new Sofa("IKEA","Super Comfy","Blue",3)
                , new TV("JVC","Super Big",55)
                , new Light(100,"White") );

        lounge.enter();
        lounge.dimLight();
        lounge.resetLight();
        lounge.getTv().turnOff();
        lounge.leave();

    }

}
