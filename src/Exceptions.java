import java.io.File;

public class Exceptions {


    public static void main(String[] args) {

        //checked and unchecked

        Utils.sleepForMilis(2000);

        System.out.println("ispis");

        int[] mojNiz = {1, 2, 3};

        try {
            System.out.println(mojNiz[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            e.getCause();
        }catch (RuntimeException runtimeException){

        }catch (Exception ex){
            ex.printStackTrace();
        }



        System.out.println("Kraj programa!!!");


    }


}
