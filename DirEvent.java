package Catalogue;

/**
 * Created by user on 26.11.2016.
 */
public class DirEvent implements IDirEvent {
@Override
public void onDirAdded(String s) {
    System.out.println("Dir "+" added: " + s );
}
}
