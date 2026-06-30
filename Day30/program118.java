package Day30;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String author;
    boolean isIssued;

    
    public Book(int bookId, String bookName, String author) 
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.isIssued = false; 
    }
}


public class program118
{
    static ArrayList<Book> library = new ArrayList<>(); 
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int choice;

        library.add(new Book(101, "Java: The Complete Reference", "Herbert Schildt"));
        library.add(new Book(102, "To Kill a Mockingbird", "Harper Lee"));
        library.add(new Book(103, "The Great Gatsby", "F. Scott Fitzgerald"));

        System.out.println("=== WELCOME TO THE B.TECH FIRST YEAR LIBRARY SYSTEM ===");

        do 
        {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add a New Book (Admin)");
            System.out.println("2. View All Books");
            System.out.println("3. Issue / Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Search Book by bookName");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) 
            {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    issueBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    searchBook();
                    break;
                case 6:
                    System.out.println("Thank you for using the Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
    }

    // Function to add a book
    public static void addBook() 
    {
        System.out.print("Enter Unique Book ID (Integer): ");
        int id = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter Book bookName: ");
        String bookName = sc.nextLine();
        
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        Book newBook = new Book(id, bookName, author);
        library.add(newBook);
        System.out.println("SUCCESS: Book \"" + bookName + "\" added to the library catalog.");
    }

    // Function to view all books
    public static void viewBooks() 
    {
        if (library.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }

        System.out.println("\n----------------------------------------------------------------------");
        System.out.printf("%-10s %-35s %-20s %-10s\n", "ID", "bookName", "AUTHOR", "STATUS");
        System.out.println("----------------------------------------------------------------------");
        
        for (Book b : library) {
            String status = b.isIssued ? "Borrowed" : "Available";
            System.out.printf("%-10d %-35s %-20s %-10s\n", b.bookId, b.bookName, b.author, status);
        }
        System.out.println("----------------------------------------------------------------------");
    }

    // Function to issue a book
    public static void issueBook() 
    {
        System.out.print("Enter the Book ID you want to borrow: ");
        int id = sc.nextInt();
        
        for (Book b : library) 
        {
            if (b.bookId == id) 
            {
                if (b.isIssued) 
                {
                    System.out.println("SORRY: This book is already borrowed by someone else.");
                } 
                else 
                {
                    b.isIssued = true;
                    System.out.println("SUCCESS: Book \"" + b.bookName + "\" has been issued to you.");
                }
                return; 
            }
        }
        System.out.println("ERROR: Book ID not found in our records.");
    }
    // Function to return the book
    public static void returnBook() 
    {
        System.out.print("Enter the Book ID you want to return: ");
        int id = sc.nextInt();

        for (Book b : library) 
        {
            if (b.bookId == id) 
            {
                if (!b.isIssued) 
                {
                    System.out.println("ALERT: This book is already marked as available in the library.");
                } 
                else 
                {
                    b.isIssued = false;
                    System.out.println("SUCCESS: Book \"" + b.bookName + "\" returned successfully.");
                }
                return;
            }
        }
        System.out.println("ERROR: Book ID not found in our records.");
    }

    // Function to search for a book by bookName (using basic String functions)
    public static void searchBook() {
        System.out.print("Enter the bookName (or keyword) to search: ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;

        System.out.println("\n--- Search Results ---");
        for (Book b : library) 
        {
            if (b.bookName.toLowerCase().contains(keyword)) 
            {
                String status = b.isIssued ? "Borrowed" : "Available";
                System.out.println("ID: " + b.bookId + " | " + b.bookName + " by " + b.author + " [" + status + "]");
                found = true;
            }
        }
        
        if (!found) 
        {
            System.out.println("No books matched your search query.");
        }
    }
}
