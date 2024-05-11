import { Visitor } from "./Visitor";
import { Exhibit } from "./Exhibit";

export class Sculpture implements Exhibit {
    accept(visitor: Visitor): void {
        visitor.visitSculpture(this);
    }
}
