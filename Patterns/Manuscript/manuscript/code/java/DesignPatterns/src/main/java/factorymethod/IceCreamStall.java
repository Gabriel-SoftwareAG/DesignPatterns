package factorymethod;

public class IceCreamStall extends FoodStall {
    Product createProduct() {
        return new ConcreteProductB();
    }
}
