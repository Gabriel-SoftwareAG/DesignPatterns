namespace Flyweight;
using System.Collections.Generic;

class Library
{
    private Dictionary<string, Book> _books = new Dictionary<string, Book>();

    public Book GetBook(string title, string author)
    {
        if (!_books.ContainsKey(title))
        {
            _books[title] = new ConcreteBook(title, author, _books.Count + 1);
        }
        return _books[title];
    }

    public void BorrowBook(string title, string author)
    {
        Book book = GetBook(title, author);
        if (book.IsAvailable())
        {
            book.BorrowBook();
        }
        else
        {
            Book newBook = new ConcreteBook(title, author, _books.Count + 1);
            _books[title] = newBook;
            System.Console
            .WriteLine($"New copy ordered for: {title} book id: {book.GetId() + 1}");
            newBook.BorrowBook();
        }
    }

    public void ReturnBook(string title)
    {
        if (_books.ContainsKey(title))
        {
            _books[title].ReturnBook();
        }
    }
}
