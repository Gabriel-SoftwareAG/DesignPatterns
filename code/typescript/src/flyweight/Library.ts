import { Book } from "./Book";
import { ConcreteBook } from "./ConcreteBook";

export class Library {
    private books: Record<string, Book> = {};

    getBook(title: string, author: string): Book {
        if (!this.books[title]) {
            this.books[title] = new ConcreteBook(title, author, Object.keys(this.books).length + 1);
        }
        return this.books[title];
    }

    borrowBook(title: string, author: string): void {
        const book = this.getBook(title, author);
        if (book.isAvailable()) {
            book.borrowBook();
        } else {
            const newBook = new ConcreteBook(title, author, Object.keys(this.books).length + 1);
            this.books[title] = newBook;
            console.log(`New copy ordered for: ${title} book id: ${book.getId() + 1}`);
            newBook.borrowBook();
        }
    }

    returnBook(title: string): void {
        const book = this.books[title];
        if (book) {
            book.returnBook();
        } else {
            console.log(`Book with title ${title} not found in the library.`);
        }
    }
}
