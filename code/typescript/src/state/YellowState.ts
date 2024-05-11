import { State } from "./State";

export class YellowState implements State {
    handleRequest(): void {
        console.log("Yellow light - Caution!");
        // Logic to switch to the red light
    }
}
