package Books;

/**
 * Created by user on 17.11.2016.
 */
public class MainBook {
    public static void main(String[] args) {
        DocumentalLitBook h = new DocumentalLitBook();
        h.setBookName("First Book");
        System.out.println(h.getBookName());
    }
}