namespace Visitor {
    class Museum {
        static Visitor(): void {
            let painting: Exhibit = new Painting();
            let sculpture: Exhibit = new Sculpture();

            let patron: Visitor = new Patron();

            painting.accept(patron); // Patron interacts with a painting exhibit
            sculpture.accept(patron); // Patron interacts with a sculpture exhibit
        }
    }

    Program.Visitor();
}
