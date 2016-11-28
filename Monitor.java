package Monitor.src;

import java.io.File;

public class Monitor {
	String file;
	IFileEvent event;
	int number;

	
	public Monitor(String file, IFileEvent event, int number) {
		this.file = file;
		this.event = event;
		this.number=number;
	}

	public void start() {
		while (true) {
			File f = new File(file);
			if (f.exists() && f.isFile())
			{
				if (event != null)
					event.onFileAdded(file, number);
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			System.out.println("Waiting...");
		}
	}
}
