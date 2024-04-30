namespace Visitor {
    export interface Visitor {
        visitPainting(painting: Painting): void;
        visitSculpture(sculpture: Sculpture): void;
    }
}
