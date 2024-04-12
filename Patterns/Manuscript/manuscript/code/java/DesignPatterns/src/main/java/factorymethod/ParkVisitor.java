package factorymethod;

public class ParkVisitor {
    public static void main(String[] args) {
        FoodStall pizzaStall = new PizzaStall();
        FoodStall iceCreamStall = new IceCreamStall();

        // Ordering dishes from different food stalls
        Product pizza = pizzaStall.createProduct();
        Product iceCream = iceCreamStall.createProduct();

        // Using the dishes
        // (Park visitor receives and enjoys the dishes without knowing their specific type)
        System.out.println("Ordered Pizza: " + pizza.getClass().getSimpleName());
        System.out.println("Ordered Ice Cream: " + iceCream.getClass().getSimpleName());
    }
}
