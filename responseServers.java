package WorkedServers;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 10.01.2017.
 * https://gist.github.com/
 * https://prog.kiev.ua/
 * http://stackoverflow.com/
 * http://help.dreamhost.com/
 */
public class responseServers {
    public static void main(String[] args) {
        String listPath = "E:\\Testing Libs\\Test1\\servershw.txt";
        String reportPath = "E:\\Testing Libs\\Test1\\serverReport.txt";
        try {
            workedServer(listPath, reportPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void workedServer(String listPath, String reportPath) {
        File reportFile = new File(reportPath);
        Scanner in = null;
        ArrayList<String> listURL = new ArrayList<>();
        try {
            in = new Scanner(new File(listPath));
            File f = new File(reportPath);

            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (in.hasNext()) {
            String line = in.nextLine();
            System.out.println(line);
            listURL.add(line);
            Socket socket;
            try {
                socket = new Socket(line, 80);
                String temp = "Server: " + socket.getInetAddress() + " - 200 Ok";
                System.out.println(temp);
                socket.close();
            } catch (IOException e) {
                    System.out.println("404 Server Not Found");
            }
        }
        in.close();
    }
}


//            String line2 = line.substring(line.indexOf("/")+2, line.length());
//            if (line2.substring(line2.length()-1).equalsIgnoreCase("/")){
//                line2=line2.substring(0,line2.length()-1);
//            }