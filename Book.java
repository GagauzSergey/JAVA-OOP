package Books;

/**
 * Created by user on 17.11.2016.
 */
abstract class Book {
    private int pages;
    private boolean hardcover;
    private String bookname;
    private String authorname;

    public void setPages(){}
    public void getPages(){}

    public void setBookName(String name){}
    public String getBookName(){
        return bookname;
    }

    public void setAuthorName(){}
    public void getSetAuthorName(){}
    
    public void PageQuant (){}
}
