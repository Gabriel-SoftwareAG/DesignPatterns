package flyweight;

interface Book {
    boolean isAvailable();
    void checkOut(String borrowerId, String dueDate);
    void returnBook();
}
