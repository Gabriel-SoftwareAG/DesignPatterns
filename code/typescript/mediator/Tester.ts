import { Colleague } from "./Colleague";
import { Mediator } from "./Mediator";

export class Tester extends Colleague {
    constructor(mediator: Mediator) {
        super(mediator);
    }

    send(message: string): void {
        console.log(`Tester sending message: ${message}`);
        this.mediator.request(message, this);
    }

    receive(message: string): void {
        console.log(`Tester received task: ${message}`);
    }
}
