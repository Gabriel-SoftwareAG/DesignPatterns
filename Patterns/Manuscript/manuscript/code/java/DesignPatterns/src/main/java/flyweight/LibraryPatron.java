package flyweight;

class LibraryPatron {
    private String patronId;

    public LibraryPatron(String patronId) {
        this.patronId = patronId;
    }

    public void borrowBook(Library library, String genre, String title, String author, String dueDate) {
        Book book = library.getBook(genre, title, author);
        book.checkOut(patronId, dueDate);
    }

    public void returnBook(Library library, String genre, String title, String author) {
        Book book = library.getBook(genre, title, author);
        book.returnBook();
    }
}
