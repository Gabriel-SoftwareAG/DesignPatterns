package abstractfactory;

public class ParkVisitor {
    public static void main(String[] args) {
        // Choose themed area (factory)
        AbstractFoodStallFactory factory1 = new AdventureLandFactory();
        AbstractFoodStallFactory factory2 = new FantasyLandFactory();

        // Order themed food items
        AbstractProductA iceCream1 = factory1.createProductA();
        AbstractProductB pizza1 = factory1.createProductB();

        AbstractProductA iceCream2 = factory2.createProductA();
        AbstractProductB pizza2 = factory2.createProductB();

        // Enjoy themed food items
        iceCream1.enjoy();
        pizza1.enjoy();
        iceCream2.enjoy();
        pizza2.enjoy();
    }
}
