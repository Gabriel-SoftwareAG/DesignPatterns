package visitor;

class Museum {
    public static void main(String[] args) {
        Exhibit painting = new Painting();
        Exhibit sculpture = new Sculpture();

        Visitor patron = new Patron();

        painting.accept(patron); // Patron interacts with a painting exhibit
        sculpture.accept(patron); // Patron interacts with a sculpture exhibit

    }
}
