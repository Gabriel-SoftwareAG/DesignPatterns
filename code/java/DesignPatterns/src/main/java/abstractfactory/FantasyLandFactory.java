package abstractfactory;

class FantasyLandFactory implements AbstractFoodStallFactory {
    @Override
    public IceCream createIceCream() {

        System.out.println("Creating magical-themed ice cream");
        return new MagicalIceCream();
    }

    @Override
    public Pizza createPizza() {
        System.out.println("Creating enchanted-themed pizza");
        return new EnchantedPizza();
    }
}
