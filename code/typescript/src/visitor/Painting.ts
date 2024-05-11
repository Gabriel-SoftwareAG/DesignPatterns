import { Visitor } from "./Visitor";
import { Exhibit } from "./Exhibit";

export class Painting implements Exhibit {
    accept(visitor: Visitor): void {
        visitor.visitPainting(this);
    }
}
