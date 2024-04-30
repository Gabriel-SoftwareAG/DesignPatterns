namespace AbstractFactory;

public class ParkVisitor
{
    public static void VisitPark()
    {
        // Choose themed area (factory)
        AbstractFoodStallFactory adventureLandFactory =
                                                    new AdventureLandFactory();
        AbstractFoodStallFactory fantasyLandFactory = new FantasyLandFactory();

        // Order themed food items
        IceCream tropicalIceCream = adventureLandFactory.CreateIceCream();
        Pizza exoticPizza = adventureLandFactory.CreatePizza();

        IceCream magicalIceCream = fantasyLandFactory.CreateIceCream();
        Pizza enchantedPizza = fantasyLandFactory.CreatePizza();

        // Enjoy themed food items
        tropicalIceCream.Enjoy();
        exoticPizza.Enjoy();
        magicalIceCream.Enjoy();
        enchantedPizza.Enjoy();
    }
}
