namespace Visitor;

public class Museum
{
    public static void VisitorExample()
    {
        Exhibit painting = new Painting();
        Exhibit sculpture = new Sculpture();

        IVisitor patron = new Patron();

        painting.Accept(patron); // Patron interacts with a painting exhibit
        sculpture.Accept(patron); // Patron interacts with a sculpture exhibit
    }
}
