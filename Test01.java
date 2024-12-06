package task3.solution1;

import java.util.Scanner;

public class Test01 { // class with main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner class object to get user input
        // Create an instance of the Library class
        Library01 library=new Library01();
        // Infinite loop to display menu and take user input until they choose to exit
        while(true) {
            // Display menu options to user
            System.out.println(" Library Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt(); // Read user's choice
            sc.nextLine();
            // Perform action based on the user's choice
            switch (choice) {
                case 1: // Option to add book
                    System.out.print("Enter Book ID:");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title:");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author:");
                    String author = sc.nextLine();
                    System.out.print("Is the book available? (true/false):");
                    boolean isAvailable = sc.nextBoolean();
                    library.addBooks(bookId, title, author, isAvailable); // calls addBooks method
                    break;
                case 2: // Option to remove book
                    System.out.print("Enter Book ID to remove:");
                    int removeId = sc.nextInt();
                    library.removeBook(removeId); // calls removeBooks method
                    break;
                case 3: // Option to search book
                    System.out.print("Enter Book ID to search:");
                    int searchId = sc.nextInt();
                    library.searchBooks(searchId); // calls searchBooks method
                    break;
                case 4: // Option to display book
                    library.displayBooks(); // calls displayBooks method
                    break;
                case 5: // Option to exit
                    System.out.print("Exit..");
                    sc.close(); // close Scanner class object
                    return;
                default: // handles invalid choices
                    System.out.print("Invalid choice.");
            }
        }
    }
}

