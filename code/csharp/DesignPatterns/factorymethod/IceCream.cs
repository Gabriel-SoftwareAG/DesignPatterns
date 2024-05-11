namespace FactoryMethod;

class IceCream : Product
{
    public override Product Serve()
    {
        System.Console.WriteLine("Ice cream served");
        return this;
    }
}
