namespace Flyweight;

public class FlyweightClient
{
    public static void FlyweightExample()
    {
        Library library = new Library();

        // User 1 borrows a book
        library.BorrowBook("Harry Potter", "J. K. Rowling");

        // User 2 tries to borrow the same book
        library.BorrowBook("Harry Potter", "J. K. Rowling");

        // User 1 returns the book
        library.ReturnBook("Harry Potter");

        // User 3 borrows the book
        library.BorrowBook("Harry Potter", "J. K. Rowling");
    }
}
