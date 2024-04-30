namespace Visitor {
    export class Sculpture implements Exhibit {
        accept(visitor: Visitor): void {
            visitor.visitSculpture(this);
        }
    }
}
