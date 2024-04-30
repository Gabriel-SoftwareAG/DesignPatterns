import { Command } from "./Command";
import { Receiver } from "./Receiver";

export class PreparePizzaCommand implements Command {
    private receiver: Receiver;

    constructor(receiver: Receiver) {
        this.receiver = receiver;
    }

    execute(): void {
        console.log("PreparePizzaCommand.execute(): Delegating to Receiver.preparePizza()");
        this.receiver.preparePizza();
    }
}
