package Catalogue;
import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by user on 26.11.2016.
 */
public class MonitorDir {
    String file;
    IDirEvent devent;


    public MonitorDir(String file, IDirEvent devent) {
        this.file = file;
        this.devent = devent;
    }

    public void dstart() {
        while (true) {
            File z = new File(file);
            if (z.exists() && z.isDirectory()) {
                if (devent != null)
                    devent.onDirAdded(file);
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("Waiting Dir...");
        }
    }

}


