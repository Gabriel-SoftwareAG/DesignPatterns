import { FoodStall } from "./FoodStall";
import { Pizza } from "./Pizza";

export class PizzaStall extends FoodStall {
    prepareFood(): Pizza {
        console.log("Pizza is being prepared");
        return new Pizza();
    }
}
