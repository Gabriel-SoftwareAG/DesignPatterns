package abstractfactory;

public class AdventureLandFactory implements AbstractFoodStallFactory {
    public AbstractProductA createProductA() {
        return new TropicalIceCream();
    }

    public AbstractProductB createProductB() {
        return new ExoticPizza();
    }
}
