namespace Composite;

abstract class PizzaDecorator : IPizza
{
    protected IPizza _pizza;

    public PizzaDecorator(IPizza pizza)
    {
        _pizza = pizza;
    }

    public virtual void Bake()
    {
        _pizza.Bake();
    }
}
