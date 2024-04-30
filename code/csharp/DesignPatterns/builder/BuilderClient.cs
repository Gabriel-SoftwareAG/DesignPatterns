using System;

public class BuilderClient
{
    public static void Builder()
    {
        IBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.ConstructSandwich();
        Product sandwich = builder.GetProduct();

        sandwich.Show();
    }
}
