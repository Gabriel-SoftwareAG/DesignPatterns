package singleton;

public class Client {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Use the library instance
        library.borrowABook();
    }
}

