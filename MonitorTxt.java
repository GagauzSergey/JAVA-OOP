package Catalogue;
import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by user on 26.11.2016.
 */
public class MonitorTxt {

    String file;
    IFileEvent fevent;
    String ext;


    public MonitorTxt(String ext, String file, IFileEvent fevent) {
        this.file = file;
        this.fevent = fevent;
        this.ext=ext;
    }

    public void fstart() {
        while (true) {
            String t = null;
            File z = new File(file);
            File[] files = z.listFiles(new MyFileFilter(ext));
            for (int i=0; i<files.length;++i) {
                t =files[0].getAbsolutePath();
            }
            if (files.length>0) {

                if (fevent != null)
                    fevent.onFileAdded(t, ext);
                    break;
            }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println("Waiting "+ext+" file ...");

        }
    }
}

class MyFileFilter implements FilenameFilter {
    private String ext;

    public MyFileFilter(String ext) {
        this.ext = ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

