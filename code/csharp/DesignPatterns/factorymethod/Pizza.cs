namespace FactoryMethod;
class Pizza : Product
{
    public override Product Serve()
    {
        System.Console.WriteLine("Pizza served");
        return this;
    }
}
