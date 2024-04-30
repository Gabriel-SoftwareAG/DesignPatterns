namespace FactoryMethod;

public class FactoryMethodClient
{
    public static void FactoryMethod()
    {
        FoodStall pizzaStall = new PizzaStall();
        FoodStall iceCreamStall = new IceCreamStall();

        Product pizza = pizzaStall.TakeOrder();
        Product iceCream = iceCreamStall.TakeOrder();
    }
}
