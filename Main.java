package NewNewStread;

/**
 * Created by user on 10.12.2016.
 */

public class Main{
    public static void main(String[] args) {
        FirstThread fif = new FirstThread();
        fif.start();
//        try {
//            fif.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fif.interrupt();
        System.out.println("Fin");
    }
}