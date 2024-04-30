namespace Visitor;

class Sculpture : Exhibit
{
    public void Accept(IVisitor visitor)
    {
        visitor.VisitSculpture(this);
    }
}
