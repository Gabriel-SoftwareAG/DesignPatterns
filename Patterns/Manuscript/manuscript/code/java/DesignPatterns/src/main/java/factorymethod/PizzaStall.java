package factorymethod;

class PizzaStall extends FoodStall {
    @Override
    Product prepareFood() {
        System.out.println("Pizza is being prepared");
        return new Pizza();
    }
}
