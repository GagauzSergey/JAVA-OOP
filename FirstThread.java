package NewNewStread;
import java.util.ArrayList;
/**
 * Created by user on 10.12.2016.
 */
public class FirstThread extends Thread {

    public void run() {

        System.out.println("Start");
        ArrayList<SecondThread> a = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            SecondThread nt = new SecondThread();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nt.start();
            a.add(nt);

        }

        while (!isInterrupted()) {
            System.out.println("Main Thread try to stop");
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }

        for (SecondThread b : a) {
            b.interrupt();
            System.out.println("Start interrupt " +b.getName());
        }
    }
}

