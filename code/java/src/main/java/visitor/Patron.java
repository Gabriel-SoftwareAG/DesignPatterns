package visitor;

class Patron implements Visitor {
    @Override
    public void visitPainting(Painting painting) {
        // Interact with the painting exhibit
        System.out.println("Patron admires the painting");
    }

    @Override
    public void visitSculpture(Sculpture sculpture) {
        // Interact with the sculpture exhibit
        System.out.println("Patron examines the sculpture");
    }
}