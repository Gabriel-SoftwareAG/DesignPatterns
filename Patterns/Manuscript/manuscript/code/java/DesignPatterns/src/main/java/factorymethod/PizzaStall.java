package factorymethod;

public class PizzaStall extends FoodStall {
    Product createProduct() {
        return new ConcreteProductA();
    }
}
