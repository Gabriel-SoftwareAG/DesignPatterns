package flyweight;

interface Book {
    void borrowBook();

    void returnBook();

    boolean isAvailable();

    int getId();
}
