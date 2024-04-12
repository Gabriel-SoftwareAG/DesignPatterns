package factorymethod;

public abstract class FoodStall {
    abstract Product createProduct();
    void takeOrder() {
        Product product = createProduct();
        // Additional operations using the product
    }
}
