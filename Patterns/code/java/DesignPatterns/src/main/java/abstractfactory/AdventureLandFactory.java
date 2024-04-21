package abstractfactory;

class AdventureLandFactory implements AbstractFoodStallFactory {

    @Override
    public IceCream createIceCream() {
        System.out.println("Creating tropical-themed ice cream");
        return new TropicalIceCream();
    }

    @Override
    public Pizza createPizza() {
        System.out.println("Creating exotic-themed pizza");
        return new ExoticPizza();
    }
}
