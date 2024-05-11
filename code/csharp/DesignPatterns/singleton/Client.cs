namespace Singleton;
using System;

class Client
{
    public static void Singleton()
    {
        Library library = Library.GetInstance();

        // Use the library instance
        library.BorrowABook();
    }
}
