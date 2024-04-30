namespace Flyweight;
public interface Book
{
    void BorrowBook();
    void ReturnBook();
    bool IsAvailable();
    int GetId();
}
