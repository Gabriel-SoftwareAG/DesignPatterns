package abstractfactory;

class ExoticPizza implements Pizza {
    @Override
    public void enjoy() {
        System.out.println("Enjoy exotic-themed pizza");
    }
}