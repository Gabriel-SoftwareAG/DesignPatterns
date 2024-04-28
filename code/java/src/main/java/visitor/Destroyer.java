package visitor;

public class Destroyer implements Visitor{
    @Override
    public void visitPainting(Painting painting) {
        System.out.println("Destroyer destroys the painting");
    }

    @Override
    public void visitSculpture(Sculpture sculpture) {
        System.out.println("Destroyer destroys the sculpture");
    }


}
