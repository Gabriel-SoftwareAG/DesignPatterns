namespace AbstractFactory;

class AdventureLandFactory : AbstractFoodStallFactory
{
    public IceCream CreateIceCream()
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
