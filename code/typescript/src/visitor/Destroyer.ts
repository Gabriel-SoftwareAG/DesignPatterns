import { Visitor } from "./Visitor";
import { Painting } from "./Painting";
import { Sculpture } from "./Sculpture";

export class Destroyer implements Visitor {
    visitPainting(painting: Painting): void {
        console.log("Destroyer destroys the painting");
    }

    visitSculpture(sculpture: Sculpture): void {
        console.log("Destroyer destroys the sculpture");
    }
}
