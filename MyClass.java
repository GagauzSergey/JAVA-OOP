package ReadFromDiffThreads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 01.01.2017.
 */
public class MyClass {
    public static void main(String[] args) {
        String filePath = "E:\\Testing Libs\\Teat2\\r.txt";
        ArrayList<String> s= new ArrayList<>();
        s.add("Thread1");
        s.add("Thread2");
        s.add("Thread3");
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i=0;i<s.size();i++){
            ReadData data = new ReadData(file,s.get(i),filePath);
            data.run();
            System.out.println("Thread"+(i+1)+" copy write is complete");
        }
    }
}
