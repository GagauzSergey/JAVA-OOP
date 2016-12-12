package FindFiles;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class MainFF {

	static class MyFileFilter implements FilenameFilter {
		private String ext;

		public MyFileFilter(String ext) {
			this.ext = ext;
		}

		public boolean accept(File dir, String name) {
			return name.endsWith(ext);
		}
	}

	private static void findFiles(String srcPath, String ext, ArrayList<String> list) throws IOException {
		File dir = new File(srcPath);
		File[] files = dir.listFiles(new MyFileFilter(ext));

		for (int i = 0; i < files.length; i++) {
			list.add(srcPath + files[i].getName());
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
        String [] str = {".txt",".docx",".xlsx"};

		try {
			for (String sr: str) {
			findFiles("E:\\Testing Libs", sr, list);}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String s : list)
			System.out.println(s);
	}

}