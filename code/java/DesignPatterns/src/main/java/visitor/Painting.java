package visitor;

class Painting implements Exhibit {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPainting(this);
    }
}
