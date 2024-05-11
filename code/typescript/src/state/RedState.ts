import { State } from "./State";

export class RedState implements State {
    handleRequest(): void {
        console.log("Red light - Stop!");
        // Logic to switch to the green light
    }
}
