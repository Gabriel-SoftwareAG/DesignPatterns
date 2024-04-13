package decorator;

class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        System.out.println("Adding mushrooms");
    }
}
