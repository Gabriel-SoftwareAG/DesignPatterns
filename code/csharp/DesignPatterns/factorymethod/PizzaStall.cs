namespace FactoryMethod;
public class PizzaStall : FoodStall
{
    public override Product PrepareFood()
    {
        System.Console.WriteLine("Pizza is being prepared");
        return new Pizza();
    }
}
