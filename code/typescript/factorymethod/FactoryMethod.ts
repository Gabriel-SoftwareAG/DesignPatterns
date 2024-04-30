import { FoodStall } from "./FoodStall";
import { PizzaStall } from "./PizzaStall";
import { IceCreamStall } from "./IceCreamStall";

export function FactoryMethod(): void {
    let pizzaStall: FoodStall = new PizzaStall();
    let iceCreamStall: FoodStall = new IceCreamStall();

    let pizza = pizzaStall.takeOrder();
    let iceCream = iceCreamStall.takeOrder();
}
