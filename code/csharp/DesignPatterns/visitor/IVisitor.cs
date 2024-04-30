namespace Visitor;

interface IVisitor
{
    void VisitPainting(Painting painting);
    void VisitSculpture(Sculpture sculpture);
}
