import { PizzaDecorator } from "./PizzaDecorator";
import { Pizza } from "./Pizza";

export class TomatoDecorator extends PizzaDecorator {
    constructor(pizza: Pizza) {
        super(pizza);
    }

    bake(): void {
        super.bake();
        console.log("Adding tomatoes");
    }
}
