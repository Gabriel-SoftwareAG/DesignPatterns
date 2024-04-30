namespace AbstractFactory;

class FantasyLandFactory : AbstractFoodStallFactory
{
    public IceCream CreateIceCream()
    {
        Console.WriteLine("Creating magical-themed ice cream");
        return new MagicalIceCream();
    }

    public Pizza CreatePizza()
    {
        Console.WriteLine("Creating enchanted-themed pizza");
        return new EnchantedPizza();
    }
}
