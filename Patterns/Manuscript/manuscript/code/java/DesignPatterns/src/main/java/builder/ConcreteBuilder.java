package builder;

public class ConcreteBuilder implements Builder {
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    public void buildPartA() {
        product.addPart("Whole Wheat Bread");
    }

    public void buildPartB() {
        product.addPart("Turkey");
    }

    public void buildPartC() {
        product.addPart("Lettuce, Tomato, Onion");
    }

    public Product getProduct() {
        return product;
    }
}