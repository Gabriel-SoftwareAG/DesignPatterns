namespace Visitor
{
    public interface IVisitor
    {
        void VisitPainting(Painting painting);
        void VisitSculpture(Sculpture sculpture);
    }
}
