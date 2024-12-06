package task3.solution1;


public class Library01 {
    // Array to store Book objects
    private Book01[] books;
    private int count;
    // Constructor to initialize the library
    public Library01() {
        this.books = new Book01[5]; // Initializing books array with size 5
        count=0;
    }
    // Method to add new book
    public void addBooks(int bookId, String title, String author, boolean isAvailable) {
        if(count>=books.length){ // checks whether library is full or not
            System.out.println("Library is full");
        }else{
            // Create new Book object and add it to books array.
            books[count] =new Book01(bookId, title, author, isAvailable);
            count++;
            System.out.println("Book added successfully");
        }
    }
    // Method to remove book
    public void removeBook(int bookID){
        // Loop to find the book with the givenID to remove it
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookId() == bookID) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                System.out.println("Book removed successfully");
                return;
            }
        }
    }
    // Method to search book
    public void searchBooks(int bookID){
        // Loop to find the book with the given ID.
        for (int i=0;i<count;i++){
            if(this.books[i].getBookId()==bookID){
                //this.books[i].toString();
                // if book is found print its details
                System.out.println(this.books[i].toString());
                return;
            }
        }
        System.out.println("Book not found");
    }
    // Method to display books
    public void displayBooks(){
        if(count==0) {
            // no books in the library
            System.out.println("Library is empty");
        }else{
            for (Book01 bookDetails : books) {
                if (bookDetails != null) {
                    System.out.println(bookDetails.toString());
                }
            }
        }
    }
}
