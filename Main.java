package simleServer;

/**
 * Created by user on 14.12.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        final Server s = new Server(20000);
        s.start();

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {s.stop();
            }
        }));
    }
}