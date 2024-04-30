using System;

namespace Singleton
{
    public class Client
    {
        public static void Singleton()
        {
            Library library = Library.GetInstance();

            // Use the library instance
            library.BorrowABook();
        }
    }
}
