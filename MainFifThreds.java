package FiftyThreads;

/**
 * Created by user on 10.12.2016.
 */
public class MainFifThreds{
    public static void main(String[] args) {
        FifCounter fif = new FifCounter();
        fif.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fif.interrupt();
        System.out.println("Fin");
    }
}