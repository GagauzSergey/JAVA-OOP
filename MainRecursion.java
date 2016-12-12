package Recursion;

import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

/**
 * Created by user on 12.12.2016.
 * Files in directory
 * E:\Testing Libs\
 * tAst.txt
 * test2.xlsx
 * test3test.docx
 */
public class MainRecursion {
    private static void listAll(String path, ArrayList<String> res) throws IOException {
        File dir = new File(path);
        File[] list = dir.listFiles();
        if (list == null) return;
        for (File f : list) {
            if (f.isFile()) {
                if ((f.getName().substring(0, f.getName().indexOf(".")).length() == 5) ||
                        (f.getName().substring(1, 2).equals("A"))) {
                    {
                        res.add(f.getName());
                    }
                } else {
                    listAll(f.getCanonicalPath(), res);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> res = new ArrayList<>();
        try {
            MainRecursion.listAll("E:\\Testing Libs", res);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }
}
