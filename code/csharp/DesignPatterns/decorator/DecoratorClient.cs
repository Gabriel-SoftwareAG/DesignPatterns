namespace Decorator;
using System;
using Composite;

public class DecoratorClient
{
    public static void DecoratorExample()
    {
        IPizza plainCheesePizza = new PlainCheesePizza();

        IPizza tomatoPizza = new TomatoDecorator(plainCheesePizza);
        tomatoPizza.Bake();

        IPizza mushroomPizza = new MushroomDecorator(plainCheesePizza);
        mushroomPizza.Bake();

        IPizza deluxePizza = new MushroomDecorator(new TomatoDecorator(plainCheesePizza));
        deluxePizza.Bake();
    }
}
