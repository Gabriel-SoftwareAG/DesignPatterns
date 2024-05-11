namespace FactoryMethod;

abstract class FoodStall
{
    public abstract Product PrepareFood();

    public Product TakeOrder()
    {
        System.Console.WriteLine($"Order placed at {this.GetType().Name}!");
        Product product = PrepareFood();
        return product.Serve();
    }
}
