namespace Visitor {
    export class Patron implements Visitor {
        visitPainting(painting: Painting): void {
            // Interact with the painting exhibit
            console.log("Patron admires the painting");
        }

        visitSculpture(sculpture: Sculpture): void {
            // Interact with the sculpture exhibit
            console.log("Patron examines the sculpture");
        }
    }
}
