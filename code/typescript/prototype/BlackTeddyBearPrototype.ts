import { Prototype } from "./Prototype";

export class BlackTeddyBearPrototype extends Prototype {
    clone(): Prototype {
        console.log("Cloning Black Teddy Bear");
        return new BlackTeddyBearPrototype();
    }
}
