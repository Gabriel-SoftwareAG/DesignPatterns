import { Visitor } from "./Visitor";

export interface Exhibit {
    accept(visitor: Visitor): void;
}
