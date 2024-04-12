package abstractfactory;

public class FantasyLandFactory implements AbstractFoodStallFactory {
    public AbstractProductA createProductA() {
        return new MagicalIceCream();
    }

    public AbstractProductB createProductB() {
        return new EnchantedPizza();
    }
}
