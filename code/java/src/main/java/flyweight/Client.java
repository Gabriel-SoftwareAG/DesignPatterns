package flyweight;

class Client {
    public static void main(String[] args) {
        Library library = new Library();

        // User 1 borrows a book
        library.borrowBook("Harry Potter", "J. K. Rowling");

        // User 2 tries to borrow the same book
        library.borrowBook("Harry Potter", "J. K. Rowling");

        // User 1 returns the book
        library.returnBook("Harry Potter");

        // User 3 borrows the book
        library.borrowBook("Harry Potter", "J. K. Rowling");
    }
}
