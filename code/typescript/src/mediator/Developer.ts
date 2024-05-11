import { Colleague } from "./Colleague";
import { Mediator } from "./Mediator";

export class Developer extends Colleague {
    constructor(mediator: Mediator) {
        super(mediator);
    }

    send(message: string): void {
        console.log(`Developer sending message: ${message}`);
        this.mediator.request(message, this);
    }

    receive(message: string): void {
        console.log(`Developer received task: ${message}`);
    }
}
