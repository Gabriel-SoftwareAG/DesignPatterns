import { GameState } from "./GameState";

export class Player {
    private state: string;

    setState(state: string): void {
        this.state = state;
    }

    getState(): string {
        return this.state;
    }

    saveStateToMemento(): GameState {
        return new GameState(this.state);
    }

    getStateFromMemento(gameState: GameState): void {
        this.state = gameState.state;
    }
}
