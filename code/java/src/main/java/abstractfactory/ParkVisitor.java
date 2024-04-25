package abstractfactory;

class ParkVisitor {
    public static void main(String[] args) {
        // Choose themed area (factory)
        AbstractFoodStallFactory adventureLandFactory = new AdventureLandFactory();
        AbstractFoodStallFactory fantasyLandFactory = new FantasyLandFactory();

        // Order themed food items
        IceCream tropicalIceCream = adventureLandFactory.createIceCream();
        Pizza exoticPizza = adventureLandFactory.createPizza();

        IceCream magicalIceCream = fantasyLandFactory.createIceCream();
        Pizza enchantedPizza = fantasyLandFactory.createPizza();

        // Enjoy themed food items
        tropicalIceCream.enjoy();
        exoticPizza.enjoy();
        magicalIceCream.enjoy();
        enchantedPizza.enjoy();
    }
}
