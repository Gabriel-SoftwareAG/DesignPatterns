package flyweight;

class Client {
    public static void main(String[] args) {
        Library library = new Library();

        // User 1 borrows a book
        library.borrowBook("The Great Gatsby", "F. Scott Fitzgerald");

        // User 2 tries to borrow the same book
        library.borrowBook("The Great Gatsby", "F. Scott Fitzgerald");

        // User 1 returns the book
        library.returnBook("The Great Gatsby");

        // User 3 borrows the book
        library.borrowBook("The Great Gatsby", "F. Scott Fitzgerald");
    }
}
