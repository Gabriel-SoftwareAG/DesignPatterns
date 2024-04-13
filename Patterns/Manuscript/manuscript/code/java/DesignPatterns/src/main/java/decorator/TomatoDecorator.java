package decorator;

class TomatoDecorator extends PizzaDecorator {
    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        System.out.println("Adding tomatoes");
    }
}
