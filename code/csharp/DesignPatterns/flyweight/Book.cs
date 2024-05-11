namespace Flyweight;

public interface IBook
{
    void BorrowBook();
    void ReturnBook();
    bool IsAvailable();
    int GetId();
}
