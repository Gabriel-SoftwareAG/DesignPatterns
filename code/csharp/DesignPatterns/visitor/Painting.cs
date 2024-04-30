namespace Visitor;

class Painting : Exhibit
{
    public void Accept(IVisitor visitor)
    {
        visitor.VisitPainting(this);
    }
}
