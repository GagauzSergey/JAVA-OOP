package simleServer;

import java.io.IOException;
import java.lang.management.OperatingSystemMXBean;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Properties;

public class Server {
    int port;
    Thread thread;

    public Server(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        thread = new Thread() {
            public void run() {
                try {
                    ServerSocket s = new ServerSocket(port);
                    int count=0;

                    while (!isInterrupted()) {
                        Socket c2 = s.accept();
                        count++;
                        String countString = String.valueOf(count);
                        String number = "Number of connection: ";
                        String s1 = System.getProperty("os.name"); // System.getProperties().values();
                        c2.getOutputStream().write((s1+" "+number+countString).getBytes());
                        c2.close();
                    }

                    s.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }
}



/*
                        System.out.println(s1.toString());
                        String msg = "Hello!!!\r\n";
                     c1.getOutputStream().write(msg.getBytes());
*/