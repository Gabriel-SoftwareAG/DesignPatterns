import { Product } from "./Product";

export class Pizza extends Product {
    serve(): Product {
        console.log("Pizza served");
        return this;
    }
}
