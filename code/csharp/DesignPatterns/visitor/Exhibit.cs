namespace Visitor
{
    public interface Exhibit
    {
        void Accept(IVisitor visitor);
    }
}
