import { IState } from "./State";

export class TrafficLight {
    private currentState: IState;

    constructor(state: IState) {
        this.currentState = state;
    }

    perform(): void {
        this.currentState.handleRequest();
        // Logic to change the current state
    }

    setState(state: IState): void {
        this.currentState = state;
    }
}
