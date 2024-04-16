package flyweight;

class GenreBook implements Book {
    private final String title;
    private final String author;
    private final String genre; // Intrinsic state
    private boolean isAvailable = true; // Availability status

    public GenreBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void checkOut(String borrowerId, String dueDate) {
        if (isAvailable) {
            System.out.println("Book: " + title + " checked out by " + borrowerId + " due on " + dueDate);
            isAvailable = false;
        } else {
            System.out.println("Book: " + title + " is currently unavailable for checkout.");
        }
    }

    @Override
    public void returnBook() {
        isAvailable = true;
        System.out.println("Book: " + title + " has been returned and is now available.");
    }
}