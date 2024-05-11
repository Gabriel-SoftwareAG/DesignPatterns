import { FoodStall } from "./FoodStall";
import { IceCream } from "./IceCream";

export class IceCreamStall extends FoodStall {
    prepareFood(): IceCream {
        console.log("Ice cream is being prepared");
        return new IceCream();
    }
}
