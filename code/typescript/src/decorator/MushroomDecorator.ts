import { PizzaDecorator } from "./PizzaDecorator";
import { Pizza } from "./Pizza";

export class MushroomDecorator extends PizzaDecorator {
    constructor(pizza: Pizza) {
        super(pizza);
    }

    bake(): void {
        super.bake();
        console.log("Adding mushrooms");
    }
}
