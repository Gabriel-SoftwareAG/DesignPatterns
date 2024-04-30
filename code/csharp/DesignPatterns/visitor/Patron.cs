namespace Visitor;
using System;

class Patron : IVisitor
{
    public void VisitPainting(Painting painting)
    {
        // Interact with the painting exhibit
        Console.WriteLine("Patron admires the painting");
    }

    public void VisitSculpture(Sculpture sculpture)
    {
        // Interact with the sculpture exhibit
        Console.WriteLine("Patron examines the sculpture");
    }
}
