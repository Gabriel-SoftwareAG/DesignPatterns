import { State } from "./State";

export class GreenState implements State {
    handleRequest(): void {
        console.log("Green light - Go!");
        // Logic to switch to the yellow light
    }
}
