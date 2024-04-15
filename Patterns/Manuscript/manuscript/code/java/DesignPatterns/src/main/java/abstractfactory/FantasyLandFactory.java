package abstractfactory;

public class FantasyLandFactory implements AbstractFoodStallFactory {
    public IceCream createIceCream() {

        System.out.println("Creating magical-themed ice cream");
        return new MagicalIceCream();
    }

    public Pizza createPizza() {
        System.out.println("Creating enchanted-themed pizza");
        return new EnchantedPizza();
    }
}
