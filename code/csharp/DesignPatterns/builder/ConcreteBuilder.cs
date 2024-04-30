namespace Builder;

class ConcreteBuilder : IBuilder
{
    private Product _product = new Product();

    public void BuildPartA()
    {
        _product.AddPart("Whole Wheat Bread");
    }

    public void BuildPartB()
    {
        _product.AddPart("Turkey");
    }

    public void BuildPartC()
    {
        _product.AddPart("Lettuce, Tomato, Onion");
    }

    public Product GetProduct()
    {
        return _product;
    }
}
