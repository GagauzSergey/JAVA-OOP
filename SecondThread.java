package NewNewStread;

/**
 * Created by user on 10.12.2016.
 */
public class SecondThread extends Thread{

    public  void run(){
        System.out.println("Thread "+getName()+"is started");


        while (! isInterrupted()){
           // System.out.println("Thread " + getName()+"is stopped");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread "+getName()+"is stoped");
                break;
            }
        }
    }
}