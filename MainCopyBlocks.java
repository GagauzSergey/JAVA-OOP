package CopyFileBlocks;

import java.io.File;
import java.io.PrintWriter;

public class MainCopyBlocks {

    public static void main(String[] args) {
        int bufferSize = 1024 * 1000;

        File fileFrom = new File("E:\\Testing Libs\\Test1\\Gareth Emery - Huracan (Ben Gold Remix).mp3");
        File fileTo = new File("E:\\Testing Libs\\Teat2\\Copy Gareth Emery - Huracan (Ben Gold Remix).mp3");
        if (!fileFrom.exists() || !fileFrom.isFile()) {
            System.out.println("There is no file: " + fileFrom.getName());
            return;
        }
        try {
            fileTo.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(fileFrom.length() / bufferSize);
        int numberOfBlocks = (int) (fileFrom.length() / bufferSize);
        // definition of block copy start and stop points
        for (int i = 0; i < numberOfBlocks; i++) {
            new CopyFile(fileFrom, fileTo, fileFrom.length() * i / numberOfBlocks,
                    fileFrom.length() * (i + 1) / numberOfBlocks).start();
        }
        while (fileFrom.length()!=fileTo.length()){
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
