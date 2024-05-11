import { PlainCheesePizza } from "./PlainCheesePizza";
import { TomatoDecorator } from "./TomatoDecorator";
import { MushroomDecorator } from "./MushroomDecorator";

const plainCheesePizza = new PlainCheesePizza();

const tomatoPizza = new TomatoDecorator(plainCheesePizza);
tomatoPizza.bake();

const mushroomPizza = new MushroomDecorator(plainCheesePizza);
mushroomPizza.bake();

const deluxePizza = new MushroomDecorator(new TomatoDecorator(plainCheesePizza));
deluxePizza.bake();
