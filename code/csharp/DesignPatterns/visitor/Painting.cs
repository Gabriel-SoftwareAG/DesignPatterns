namespace Visitor
{
    public class Painting : Exhibit
    {
        public void Accept(IVisitor visitor)
        {
            visitor.VisitPainting(this);
        }
    }
}
