package templatemethod;

class TraditionalHouseBuilder extends HouseBuilder {

    @Override
    protected void buildWalls() {
        System.out.println("Building walls with bricks and mortar.");
    }

    @Override
    protected void installRoof() {
        System.out.println("Installing a pitched roof with clay tiles.");
    }

    @Override
    protected void doInterior() {
        System.out.println("Doing interior with a classic design and wood furniture.");
    }
}
