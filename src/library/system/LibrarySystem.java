/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.system;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class LibrarySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Search for a book by title");
            System.out.println("4. Check out a book");
            System.out.println("5. Return a book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(title, author,true);
                    library.addBook(newBook);
                    System.out.println("Book added: " + newBook);
                    break;

                case 2:
                    List<Book> allBooks = library.getAllBooks();
                    System.out.println("\nAll Books in the Library:");
                    for (Book book : allBooks) {
                        System.out.println(book);
                    }
                    break;

                case 3:
                    System.out.print("Enter the title to search for: ");
                    String searchTitle = scanner.nextLine();
                    List<Book> searchResults = library.searchByTitle(searchTitle);
                    System.out.println("\nSearch Results:");
                    if (searchResults.isEmpty()) {
                        System.out.println("No books found with that title.");
                    } else {
                        for (Book book : searchResults) {
                            System.out.println(book);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter the title of the book to check out: ");
                    String checkoutTitle = scanner.nextLine();
                    library.checkOutBook(checkoutTitle);
                    break;

                case 5:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;

                case 6:
                    System.out.println("Exiting the Library System.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    
}
