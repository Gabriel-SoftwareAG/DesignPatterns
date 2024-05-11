import { Painting } from "./Painting";
import { Sculpture } from "./Sculpture";

export interface Visitor {
    visitPainting(painting: Painting): void;
    visitSculpture(sculpture: Sculpture): void;
}
