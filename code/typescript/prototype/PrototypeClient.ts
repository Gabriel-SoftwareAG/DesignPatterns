import { BlackTeddyBearPrototype } from "./BlackTeddyBearPrototype";
import { WhiteTeddyBearPrototype } from "./WhiteTeddyBearPrototype";

export function Prototype(): void {
    let teddyBear1 = new WhiteTeddyBearPrototype();
    let teddyBear2 = new BlackTeddyBearPrototype();

    let clonedTeddyBear1 = teddyBear1.clone();
    let clonedTeddyBear2 = teddyBear2.clone();

    console.log("Cloned Teddy Bear 1:", clonedTeddyBear1.constructor.name);
    console.log("Cloned Teddy Bear 2:", clonedTeddyBear2.constructor.name);
}
