namespace Composite;

class MushroomDecorator : PizzaDecorator
{
    public MushroomDecorator(IPizza pizza) : base(pizza) {}

    public override void Bake()
    {
        base.Bake();
        System.Console.WriteLine("Adding mushrooms");
    }
}
