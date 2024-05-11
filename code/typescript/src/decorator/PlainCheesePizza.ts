import { Pizza } from "./Pizza";

export class PlainCheesePizza implements Pizza {
    bake(): void {
        console.log("Baking plain cheese pizza");
    }
}
