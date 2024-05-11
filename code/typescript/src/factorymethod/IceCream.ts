import { Product } from "./Product";

export class IceCream extends Product {
    serve(): Product {
        console.log("Ice cream served");
        return this;
    }
}
