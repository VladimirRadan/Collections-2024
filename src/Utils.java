public class Utils {

    public static void sleepForMilis(int milis) {

        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
