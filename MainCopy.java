package CopyFilesToDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 * Created by user on 12.12.2016.
 */
public class MainCopy {

    public static void main(String[] args)  {
        String pathfrom = "E:\\Testing Libs\\hwtest\\";
        String pathto = "E:\\Path2\\";
        try {
            MainCopy.listAllFiles(pathfrom, pathto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void listAllFiles(String pathfrom, String pathto) throws IOException {
        File dir = new File(pathfrom);
        File[] list = dir.listFiles();
        if (list == null) return;
        for (File f : list) {
            if (f.isFile()) {
                Path pathSource = Paths.get(pathfrom + f.getName());
                Path pathDestination = Paths.get(pathto + f.getName());
                try {
                    Files.copy(pathSource, pathDestination);
                    System.out.println(f.getName() + " copied successfully");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}




