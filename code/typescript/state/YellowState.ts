import { IState } from "./IState";

export class YellowState implements IState {
    handleRequest(): void {
        console.log("Yellow light - Caution!");
        // Logic to switch to the red light
    }
}
