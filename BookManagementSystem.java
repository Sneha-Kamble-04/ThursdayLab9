/*
Q3). write a program to create Book management system.using linked list

create class name Book,and perform following actions:

Attributes:

bookid,bookName,bookPrice,authorName,library name(static),availability

method:

createBook() will store book details.(add  3 books).

deleteBook() will delete book by Id

displayBook()will display book details
 
*/
package ThursdayLab;
import java.util.LinkedList;
import java.util.Scanner;
class Book 
{
    // Attributes
     int bookId;
     String bookName;
     double bookPrice;
     String authorName;
     static String libraryName = "MyLibrary";
     boolean availability;

    // Constructor
    public Book(int bookId, String bookName, double bookPrice, String authorName) 
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = true;
    }

    // Method to display book details
    public void displayBook() 
    {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Price: $" + bookPrice);
        System.out.println("Author: " + authorName);
        System.out.println("Library: " + libraryName);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println("------------------------");
    }

    // Getter method for availability
    public boolean isAvailable() 
    {
        return availability;
    }

    // Setter method to update availability
    public void setAvailability(boolean availability) 
    {
        this.availability = availability;
    }
}

public class BookManagementSystem
{
    public static void main(String[] args) 
    {
        LinkedList<Book> bookList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding 3 books to the linked list
        for (int i = 1; i <= 3; i++) 
        {
            Book book = createBook(scanner, i);
            bookList.add(book);
        }

        // Displaying all books
        System.out.println("Book Details:");
        displayAllBooks(bookList);

        // Deleting a book by ID
        System.out.print("Enter the Book ID to delete: ");
        int deleteBookId = scanner.nextInt();
        deleteBook(bookList, deleteBookId);

        // Displaying updated book list
        System.out.println("Updated Book Details:");
        displayAllBooks(bookList);

        // Closing the scanner
        scanner.close();
    }

    // Method to create a book
    public static Book createBook(Scanner scanner, int bookNumber) 
    {
        System.out.println("Enter details for Book " + bookNumber + ":");
        System.out.print("Book ID: ");
        int bookId = scanner.nextInt();
        System.out.print("Book Name: ");
        String bookName = scanner.next();
        System.out.print("Book Price: $");
        double bookPrice = scanner.nextDouble();
        System.out.print("Author Name: ");
        String authorName = scanner.next();

        return new Book(bookId, bookName, bookPrice, authorName);
    }

    // Method to delete a book by ID
    public static void deleteBook(LinkedList<Book> bookList, int deleteBookId) 
    {
        for (Book book : bookList) 
        {
            if (book.isAvailable() && book.bookId == deleteBookId) 
            {
                book.setAvailability(false);
                System.out.println("Book with ID " + deleteBookId + " has been deleted.");
                return;
            }
        }
        System.out.println("Book with ID " + deleteBookId + " not found or not available for deletion.");
    }

    // Method to display all books
    public static void displayAllBooks(LinkedList<Book> bookList) 
    {
        for (Book book : bookList) 
        {
            book.displayBook();
        }
    }
}


