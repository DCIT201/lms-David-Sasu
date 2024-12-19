public class App {
    public static void main(String[] args) {
        // Create Library and Patron
        Library library = new Library();
        Patron patron = new Patron("Sasu");

        // Add books to the library
        library.addBook(new Book("Julia's dance", "Peggy Oppong"));
        library.addBook(new Book("The Girl Who Can", "Ama Atta Aidoo"));

        // Display library books
        library.displayBooks();

        // Patron borrows a book
        Book bookToBorrow = new Book("Julia's Dance", "Peggu Oppong");
        library.removeBook("Julia's Dance");  // Remove from library
        patron.borrowBook(bookToBorrow);        // Add to patron's borrowed list

        // Display updated library and patron's borrowed books
        library.displayBooks();
        patron.displayBorrowedBooks();
    }
}
