package FiftyThreads;

import java.util.ArrayList;

/**
 * Created by user on 10.12.2016.
 */
public class FifCounter extends Thread {

    public void run(){

        System.out.println("Start");
         ArrayList<NewThread> a = new ArrayList<>();

      for (int i=0; i<50; i++){
          NewThread nt = new NewThread();
          nt.start();
          a.add(nt);
      }

      while (!isInterrupted()) {
          System.out.println("Main Thread is stopped");
          try {
              Thread.sleep(500);
          } catch (InterruptedException e) {
              break;
          }
      }

          for (NewThread b : a) {
              b.interrupt();
          }
  }
}
