package ReadFromDiffThreads;

import java.io.*;

/**
 * Created by user on 02.01.2017.
 */
public class ReadData implements Runnable {
    String data;
    String filePath;
    File file;

    public ReadData(File file, String data, String filePath) {
        this.data = data;
        this.filePath = filePath;
        this.file = file;
    }

    @Override
    public void run() {
        synchronized (file) {
            byte[] bytes = data.getBytes();
            writeBites(bytes, filePath);
        }
    }

    public static void writeBites(byte[] bytes, String filePath) {
        try {
            RandomAccessFile ras = new RandomAccessFile(filePath, "rw");
            ras.seek(ras.length());
            ras.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

