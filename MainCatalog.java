package Catalogue;

import  java.io.File;
import java.util.Date;

/**
 * Created by user on 26.11.2016.
 */
public class MainCatalog {
    public static void main(String[] args) {
         MonitorDir dir = new MonitorDir("E:\\PROGS\\MainDIr", new DirEvent());
         dir.dstart();

//         for (File f: file.listFiles()) {
//         String name = f.getAbsolutePath();
             
         MonitorTxt text = new MonitorTxt(".txt", "E:\\PROGS\\MainDIr", new FileEvent());
         text.fstart();}
//         System.out.println("Modified ["+new Date(dir.lastModified())+"]");


    }
