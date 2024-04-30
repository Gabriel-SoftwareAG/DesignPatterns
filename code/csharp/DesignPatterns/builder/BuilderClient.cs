namespace Builder;
using System;

public class BuilderClient
{
    public static void BuilderExample()
    {
        IBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.ConstructSandwich();
        Product sandwich = builder.GetProduct();

        sandwich.Show();
    }
}
