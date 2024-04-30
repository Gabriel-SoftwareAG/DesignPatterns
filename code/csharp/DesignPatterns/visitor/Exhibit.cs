namespace Visitor;

interface Exhibit
{
    void Accept(IVisitor visitor);
}
