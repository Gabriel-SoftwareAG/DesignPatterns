package flyweight;

import java.util.HashMap;
import java.util.Map;

class Library {
    private Map<String, Book> books = new HashMap<>();

    public Book getBook(String title, String author) {
        if (!books.containsKey(title)) {
            books.put(title, new ConcreteBook(title, author, books.size()+1));
        }
        return books.get(title);
    }

    public void borrowBook(String title, String author) {
        Book book = getBook(title, author);
        if (book.isAvailable()) {
            book.borrowBook();
        } else {
            // Simulate ordering a new copy
            Book newBook = new ConcreteBook(title, author, books.size()+1);
            books.put(title, newBook);
            System.out.println("New copy ordered for: " + title + " book id: " + (book.getId() +1) );

            newBook.borrowBook();
            books.put(title + " #" + (books.size() + 1), newBook); // Storing new copies distinctly
        }
    }

    public void returnBook(String title) {
        if (books.containsKey(title)) {
            books.get(title).returnBook();
        }
    }
}
