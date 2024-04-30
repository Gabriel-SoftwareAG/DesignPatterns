import { IState } from "./IState";

export class GreenState implements IState {
    handleRequest(): void {
        console.log("Green light - Go!");
        // Logic to switch to the yellow light
    }
}
