package singleton;

public class Library {
    private static Library uniqueInstance;
    private Library() {}
    public static synchronized Library getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Library();
        }
        System.out.println("Granting access to the central library");
        return uniqueInstance;
    }

    public void borrowABook() {
        System.out.println("Borrowing a book from the library...");
    }
}
