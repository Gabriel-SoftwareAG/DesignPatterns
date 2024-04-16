package flyweight;

import java.util.HashMap;
import java.util.Map;

class Library {
    private Map<String, Book> booksByGenre = new HashMap<>();

    public Book getBook(String genre, String title, String author) {
        String key = genre + "|" + title + "|" + author;
        if (!booksByGenre.containsKey(key) || !booksByGenre.get(key).isAvailable()) {
            booksByGenre.put(key, new GenreBook(title, author, genre));
            System.out.println("A new copy of the book has been ordered: " + title);
        }
        return booksByGenre.get(key);
    }
}
