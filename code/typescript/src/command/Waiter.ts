import { Command } from "./Command";

export class Waiter {
    private command!: Command;

    setCommand(command: Command): void {
        this.command = command;
    }

    executeCommand(): void {
        console.log(`Waiter.executeCommand(): Delegating to Command.execute() for ${this.command.constructor.name}`);
        this.command.execute();
    }
}
