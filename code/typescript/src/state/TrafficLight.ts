import { State } from "./State";

export class TrafficLight {
    private currentState: State;

    constructor(state: State) {
        this.currentState = state;
    }

    perform(): void {
        this.currentState.handleRequest();
        // Logic to change the current state
    }

    setState(state: State): void {
        this.currentState = state;
    }
}
