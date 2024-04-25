package decorator;

class Client {
    public static void main(String[] args) {
        Pizza plainCheesePizza = new PlainCheesePizza();

        // Adding tomatoes to the pizza
        Pizza tomatoPizza = new TomatoDecorator(plainCheesePizza);
        tomatoPizza.bake();

        // Adding mushrooms to the pizza
        Pizza mushroomPizza = new MushroomDecorator(plainCheesePizza);
        mushroomPizza.bake();

        // Adding both tomatoes and mushrooms to the pizza
        Pizza deluxePizza = new MushroomDecorator(new TomatoDecorator(plainCheesePizza));
        deluxePizza.bake();
    }
}
