import { Product } from "./Product";

export abstract class FoodStall {
    abstract prepareFood(): Product;

    takeOrder(): Product {
        console.log(`Order placed at ${this.constructor.name}!`);
        let product = this.prepareFood();
        return product.serve();
    }
}
