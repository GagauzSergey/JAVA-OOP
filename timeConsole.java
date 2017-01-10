package threadsT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 * Created by user on 07.12.2016.
 */
public class timeConsole{
    public static class Timer extends Thread {
    public Timer(){
    }
    public void run(){
        while(!isInterrupted()){
            try {
            System.out.println(new GregorianCalendar().getTime());
                sleep(10000);
            } catch (InterruptedException e) {
            }
            return;
        }
      }
    }
    public static void main(String[] args){
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        Timer t = new Timer();
        t.start();
        try {
            String s = d.readLine();
        if (s.equalsIgnoreCase("stop")) {
            t.interrupt();
            System.out.printf("stopped");}
        } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
