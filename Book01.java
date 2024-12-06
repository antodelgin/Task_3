package task3.solution1;

public class Book01 {
    // Private fields to store the book details
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;
    // Default constructor
    public Book01() {
    }
    // Parameterized constructor initializes book object
    public Book01(int bookId, String title, String author, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    // Getter for bookId
    public int getBookId() {
        return bookId;
    }
    // Setter for bookId
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    // Getter for title
    public String getTitle() {
        return title;
    }
    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }
    // Getter for author
    public String getAuthor() {
        return author;
    }
    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
    // Getter for isAvailable
    public boolean isAvailable() {
        return isAvailable;
    }
    // Setter for isAvailable
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    // Overrides the toString method()
    public String toString(){
        return " BookID: "+getBookId()+" Title: "+getTitle()+" Author: "+getAuthor()+" Available:"+(isAvailable ? " yes " : " no ");
    }
}