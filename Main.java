package Monitor.src;
import  java.util.Date;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		String [] list = {"E:\\test.txt", "E:\\test1.txt","E:\\test2.txt","E:\\test3.txt"};
		for (int i=0; i<list.length;i++) {
			Monitor m = new Monitor(list[i], new FileEvent(), i);
			File dir = new File(list[i]);
			m.start();
			System.out.println("Modified ["+new Date(dir.lastModified())+"]");
		}
	}
}