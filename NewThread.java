package FiftyThreads;

/**
 * Created by user on 10.12.2016.
 */
public class NewThread extends Thread{
    public void run(){
        System.out.println("Thread "+getId()+"is started");


        while (! isInterrupted()){
            System.out.println("Thread " + getId()+"is stopped");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

