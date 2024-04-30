namespace Visitor {
    export class Destroyer implements Visitor {
        visitPainting(painting: Painting): void {
            console.log("Destroyer destroys the painting");
        }

        visitSculpture(sculpture: Sculpture): void {
            console.log("Destroyer destroys the sculpture");
        }
    }
}
