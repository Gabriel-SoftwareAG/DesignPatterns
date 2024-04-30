namespace Flyweight
{
    public class ConcreteBook : Book
    {
        private readonly string _title;
        private readonly string _author;
        private bool _isAvailable = true;
        private int _id;

        public ConcreteBook(string title, string author, int id)
        {
            _title = title;
            _author = author;
            _id = id;
        }

        public void BorrowBook()
        {
            if (_isAvailable)
            {
                _isAvailable = false;
                System.Console.WriteLine($"Book borrowed: {_title} by {_author} book id: {_id}");
            }
            else
            {
                System.Console.WriteLine($"Book is currently not available: {_title}");
            }
        }

        public void ReturnBook()
        {
            _isAvailable = true;
            System.Console.WriteLine($"Book returned: {_title} by {_author} book id: {_id}");
        }

        public bool IsAvailable() => _isAvailable;
        public int GetId() => _id;
    }
}
