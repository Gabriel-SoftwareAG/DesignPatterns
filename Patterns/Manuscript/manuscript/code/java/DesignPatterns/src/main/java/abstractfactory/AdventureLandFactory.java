package abstractfactory;

public class AdventureLandFactory implements AbstractFoodStallFactory {
    public IceCream createIceCream() {
        System.out.println("Creating tropical-themed ice cream");
        return new TropicalIceCream();
    }

    public Pizza createPizza() {
        System.out.println("Creating exotic-themed pizza");
        return new ExoticPizza();
    }
}
