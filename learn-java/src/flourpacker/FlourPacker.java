package flourpacker;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        boolean canPack = false;
        int sum = 0;
        for (int i=0; i<=bigCount; i++) {
            sum = i*5;
            if (sum == goal) {
                canPack = true;
                break;
            }
            for (int j=1; j<= smallCount; j++) {
                sum++;
                if (sum == goal) {
                    canPack = true;
                    break;
                }
            }
            if (canPack) {
                break;
            }
        }
        return canPack;
    }

}
