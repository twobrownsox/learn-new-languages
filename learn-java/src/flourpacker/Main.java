package flourpacker;

public class Main {

    public static void main(String[] args) {
        testFlourPackerCanPack(1,0,4);
        testFlourPackerCanPack(1,0,5);
        testFlourPackerCanPack(0,5,4);
        testFlourPackerCanPack(2,2,11);
        testFlourPackerCanPack(-3,2,12);
        testFlourPackerCanPack(2,1,5);
        testFlourPackerCanPack(0,5,6);
        testFlourPackerCanPack(4,18,19);
    }

    public static void testFlourPackerCanPack(int bigCount, int smallCount, int goal) {
        System.out.println("Can pack " + bigCount + ", " + smallCount + " for goal " + goal + ": "
                + FlourPacker.canPack(bigCount,smallCount,goal));
    }

}
