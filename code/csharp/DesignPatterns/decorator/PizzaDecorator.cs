namespace Composite;

abstract class PizzaDecorator : IPizza
{
    protected IPizza Pizza;

    public PizzaDecorator(IPizza pizza)
    {
        Pizza = pizza;
    }

    public virtual void Bake()
    {
        Pizza.Bake();
    }
}
