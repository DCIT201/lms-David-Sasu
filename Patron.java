import java.util.ArrayList;

public class Patron {
    private String Name;
    private ArrayList<Book> borrowedBooks;

    // Constructor
    public Patron(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed \"" + book.getTitle() + "\"");
    }

    // Display borrowed books
    public void displayBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
