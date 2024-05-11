namespace AbstractFactory;

class AdventureLandFactory : IAbstractFoodStallFactory
{
    public IIceCream CreateIceCream()
    {
        Console.WriteLine("Creating tropical-themed ice cream");
        return new TropicalIceCream();
    }

    public Pizza CreatePizza()
    {
        Console.WriteLine("Creating exotic-themed pizza");
        return new ExoticPizza();
    }
}
