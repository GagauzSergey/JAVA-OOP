package Catalogue;

import Monitor.src.*;

/**
 * Created by user on 26.11.2016.
 */
    public class FileEvent implements IFileEvent {
        @Override
        public void onFileAdded(String s, String ext) {
            System.out.println(ext +" file"+" added: " + s );
        }
    }
