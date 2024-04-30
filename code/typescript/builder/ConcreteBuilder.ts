import { IBuilder } from "./IBuilder";
import { Product } from "./Product";

export class ConcreteBuilder implements IBuilder {
    private product: Product = new Product();

    public buildPartA(): void {
        this.product.addPart("Whole Wheat Bread");
    }

    public buildPartB(): void {
        this.product.addPart("Turkey");
    }

    public buildPartC(): void {
        this.product.addPart("Lettuce, Tomato, Onion");
    }

    public getProduct(): Product {
        return this.product;
    }
}
