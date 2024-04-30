import { Product } from "./Product";

export interface IBuilder {
    buildPartA(): void;
    buildPartB(): void;
    buildPartC(): void;
    getProduct(): Product;
}
