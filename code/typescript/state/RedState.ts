import { IState } from "./IState";

export class RedState implements IState {
    handleRequest(): void {
        console.log("Red light - Stop!");
        // Logic to switch to the green light
    }
}
