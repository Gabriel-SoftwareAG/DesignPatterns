namespace Visitor {
    export class Painting implements Exhibit {
        accept(visitor: Visitor): void {
            visitor.visitPainting(this);
        }
    }
}
