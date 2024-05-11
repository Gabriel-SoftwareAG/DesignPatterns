import { Pizza } from "./Pizza";

export abstract class PizzaDecorator implements Pizza {
    constructor(protected pizza: Pizza) { }

    bake(): void {
        this.pizza.bake();
    }
}
