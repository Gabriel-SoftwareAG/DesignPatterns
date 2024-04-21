package factorymethod;

class ParkVisitor {
    public static void main(String[] args) {
        FoodStall pizzaStall = new PizzaStall();
        FoodStall iceCreamStall = new IceCreamStall();

        // Ordering dishes from different food stalls
        Product pizza = pizzaStall.takeOrder();
        Product iceCream = iceCreamStall.takeOrder();
    }
}
