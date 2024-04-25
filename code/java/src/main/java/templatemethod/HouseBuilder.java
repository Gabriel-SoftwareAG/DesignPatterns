package templatemethod;

abstract class HouseBuilder {

    // The template method defining the sequence of steps to build a house.
    public final void buildHouse() {
        layFoundation();
        buildWalls();
        installRoof();
        doInterior();
    }

    // Common step implemented in the abstract class itself.
    private void layFoundation() {
        System.out.println("Laying the foundation with concrete and steel bars.");
    }

    // Steps that need to be implemented by subclasses.
    protected abstract void buildWalls();

    protected abstract void installRoof();

    protected abstract void doInterior();
}
