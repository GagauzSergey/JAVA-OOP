package Monitor.src;

public class FileEvent implements IFileEvent {
	@Override
	public void onFileAdded(String s, int i) {
		System.out.println("File "+(i+1)+" added: " + s );
	}
}
