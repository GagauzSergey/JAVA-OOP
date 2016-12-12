package newFileWithData;

import java.io.*;
import java.util.Date;

/**
 * Created by user on 12.12.2016.
 */
public class MainDataFile {
    public static void main(String[] args) {
        String path = "E:\\Testing Libs\\hwtest\\2.txt";
        File f = new File(path);
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File " + f.getName() + " created successfully");
        try {
            MainDataFile.writer(f, path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writer(File f, String path) throws IOException {
        try (BufferedWriter bos = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path)))) {
            bos.write(f.getCanonicalPath());
            bos.newLine();
            bos.write(f.getName());
            bos.newLine();
            bos.write(new Date(f.lastModified()).toString());
        }
    }
}

