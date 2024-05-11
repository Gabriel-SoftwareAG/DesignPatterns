import { FoodStall } from "./FoodStall";
import { PizzaStall } from "./PizzaStall";
import { IceCreamStall } from "./IceCreamStall";

let pizzaStall: FoodStall = new PizzaStall();
let iceCreamStall: FoodStall = new IceCreamStall();

let pizza = pizzaStall.takeOrder();
let iceCream = iceCreamStall.takeOrder();
