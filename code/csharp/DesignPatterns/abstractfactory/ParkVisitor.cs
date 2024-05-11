namespace AbstractFactory;

public class ParkVisitor
{
    public static void VisitPark()
    {
        // Choose themed area (factory)
        IAbstractFoodStallFactory adventureLandFactory =
                                                    new AdventureLandFactory();
        IAbstractFoodStallFactory fantasyLandFactory = new FantasyLandFactory();

        // Order themed food items
        IIceCream tropicalIceCream = adventureLandFactory.CreateIceCream();
        Pizza exoticPizza = adventureLandFactory.CreatePizza();

        IIceCream magicalIceCream = fantasyLandFactory.CreateIceCream();
        Pizza enchantedPizza = fantasyLandFactory.CreatePizza();

        // Enjoy themed food items
        tropicalIceCream.Enjoy();
        exoticPizza.Enjoy();
        magicalIceCream.Enjoy();
        enchantedPizza.Enjoy();
    }
}
