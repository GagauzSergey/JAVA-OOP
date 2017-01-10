package CopyFileBlocks;

import java.io.File;
import java.io.RandomAccessFile;

public class CopyFile extends Thread {
    File fileFrom;
    File fileTo;
    long startPoint;
    long endPoint;

    public CopyFile(File fileFrom, File fileTo, long startPoint, long endPoint) {
        this.fileFrom = fileFrom;
        this.fileTo = fileTo;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public void run() {
        writeFile();
    }

    public synchronized void writeFile() {
        try (RandomAccessFile in = new RandomAccessFile(fileFrom, "r");
             RandomAccessFile out = new RandomAccessFile(fileTo, "rw");) {
            //
            in.seek(startPoint);
            out.seek(startPoint);
            long i = startPoint;
            // read and write data block
            while (i < endPoint) {
                out.write(in.read());
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
