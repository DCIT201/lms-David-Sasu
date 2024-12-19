import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books
    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }

    // Remove a book by title
    public boolean removeBook(String title) {
        return books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }
}
