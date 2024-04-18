package decorator;

class PlainCheesePizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking plain cheese pizza");
    }
}
