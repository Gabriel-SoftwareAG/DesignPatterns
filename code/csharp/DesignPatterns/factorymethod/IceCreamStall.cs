namespace FactoryMethod;
public class IceCreamStall : FoodStall
{
    public override Product PrepareFood()
    {
        System.Console.WriteLine("Ice cream is being prepared");
        return new IceCream();
    }
}
