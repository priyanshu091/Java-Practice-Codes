package ArrayListOperations.Q5ListwithCustomObjects;

public class Book {

    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }


    public int getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "\nBook Title:"+title+"\nBook ID:"+bookId+"\nBook Author:"+author+"\n";
    }
}
