package dir3Hello;

import java.io.*;

/**
 * Created by user on 12.12.2016.
 */
public class MainDir {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bis = new BufferedReader(new InputStreamReader(
                new FileInputStream("E:\\Testing Libs\\tAst.txt")))) {
            System.out.println(bis.readLine());
        }
        try (BufferedWriter bos = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("E:\\Testing Libs\\tAst.txt")))) {
            bos.write("Hello");
        }
    }
}
