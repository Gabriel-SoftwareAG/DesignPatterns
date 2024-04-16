package flyweight;

class Client {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryPatron patron = new LibraryPatron("12345");

        // Patron orders a copy of the book
        patron.borrowBook(library, "Mystery", "The Hound of the Baskervilles", "Arthur Conan Doyle", "2024-04-30");
        // Patron orders another copy of the same book
        patron.borrowBook(library, "Mystery", "The Hound of the Baskervilles", "Arthur Conan Doyle", "2024-05-01");
        // Patron returns a copy of the book
        patron.returnBook(library, "Mystery", "The Hound of the Baskervilles", "Arthur Conan Doyle");
        // Patron borrows the available copy of the book
        patron.borrowBook(library, "Mystery", "The Hound of the Baskervilles", "Arthur Conan Doyle", "2024-05-02");
    }
}
