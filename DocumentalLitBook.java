package Books;

/**
 * Created by user on 17.11.2016.
 */
public class DocumentalLitBook extends Book{
    private int pages;
    private boolean hardcover;
    private String bookname;
    private String authorname;

    @Override
    public void setBookName(String name){
        this.bookname=name;
    }

    public String getBookName(){
        return bookname;
    }
    @Override
    public void PageQuant() {
    }
}
