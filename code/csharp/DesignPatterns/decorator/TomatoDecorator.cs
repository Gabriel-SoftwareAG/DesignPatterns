namespace Composite;

class TomatoDecorator : PizzaDecorator
{
    public TomatoDecorator(IPizza pizza) : base(pizza) {}

    public override void Bake()
    {
        base.Bake();
        System.Console.WriteLine("Adding tomatoes");
    }
}
