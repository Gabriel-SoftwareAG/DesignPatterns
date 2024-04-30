import { Command } from "./Command";
import { Receiver } from "./Receiver";

export class ServePastaCommand implements Command {
    private receiver: Receiver;

    constructor(receiver: Receiver) {
        this.receiver = receiver;
    }

    execute(): void {
        console.log("ServePastaCommand.execute(): Delegating to Receiver.servePasta()");
        this.receiver.servePasta();
    }
}
