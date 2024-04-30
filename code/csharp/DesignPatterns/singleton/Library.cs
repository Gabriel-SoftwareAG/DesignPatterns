namespace Singleton;
using System;

sealed class Library
{
    private static Library _uniqueInstance;
    private static readonly object _lock = new object();

    private Library() { }

    public static Library GetInstance()
    {
        lock (_lock)
        {
            if (_uniqueInstance == null)
            {
                _uniqueInstance = new Library();
                Console.WriteLine("Granting access to the central library");
            }
        }
        return _uniqueInstance;
    }

    public void BorrowABook()
    {
        Console.WriteLine("Borrowing a book from the library...");
    }
}
