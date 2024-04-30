import { Prototype } from "./Prototype";

export class WhiteTeddyBearPrototype extends Prototype {
    clone(): Prototype {
        console.log("Cloning White Teddy Bear");
        return new WhiteTeddyBearPrototype();
    }
}
