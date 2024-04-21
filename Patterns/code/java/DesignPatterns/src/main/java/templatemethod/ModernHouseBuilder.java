package templatemethod;

class ModernHouseBuilder extends HouseBuilder {

    @Override
    protected void buildWalls() {
        System.out.println("Building walls with glass and steel.");
    }

    @Override
    protected void installRoof() {
        System.out.println("Installing a flat, green roof.");
    }

    @Override
    protected void doInterior() {
        System.out.println("Doing interior with an open concept design and minimalist furniture.");
    }
}
