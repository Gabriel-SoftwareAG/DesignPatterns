import { ConcreteBuilder } from "./ConcreteBuilder";
import { Director } from "./Director";

export function Builder(): void {
    let builder = new ConcreteBuilder();
    let director = new Director(builder);

    director.constructSandwich();
    let sandwich = builder.getProduct();

    sandwich.show();
}
