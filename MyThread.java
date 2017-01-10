package threadsT;

/**
 * Created by user on 07.12.2016.
 */
public class MyThread {
    public static class Counter extends Thread {
        int from, to, sleep;

        public Counter (int from, int to, int sleep) {
            this.from = from;
            this.to = to;
            this.sleep = sleep;
        }

        public void run() {

            try {
                for (int i = from; i <= to; i++) {
                    System.out.println(i);
                    Thread.sleep(sleep);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int from = 100, to = 200, sleep = 500;
        try {
            Counter c = new Counter(from, to, sleep);
            c.start(); // запускаем поток
            c.join(); // ждем завершения потока

            System.out.println("Thread finished");
        } catch (Exception e) {
            ;
        }
    }
}