package visitor;

class Sculpture implements Exhibit {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitSculpture(this);
    }
}
