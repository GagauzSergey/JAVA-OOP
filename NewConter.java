package threadsT;

/**
 * Created by user on 07.12.2016.
 */
public class NewConter {

    public static class Counter extends Thread {
        int startdiap;
        int findiap;
        int sleeptime;

        public  Counter (int startdiap, int findiap, int sleeptime){
            this.startdiap=startdiap;
            this.findiap=findiap;
            this.sleeptime=sleeptime;
        }
        public void run(){
            try {
            for (int i=startdiap;i<findiap;i++)
                System.out.println(i);
                sleep(sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    public static void main(String[] args) {
        Counter p = new Counter(500, 600,300);
        p.start();
        try {
            p.join();
            System.out.println("Thread finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

