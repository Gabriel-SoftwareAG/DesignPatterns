import { GameState } from "./GameState";

export class SaveManager {
    private savedStates: GameState[] = [];

    add(gameState: GameState): void {
        this.savedStates.push(gameState);
    }

    get(index: number): GameState {
        return this.savedStates[index];
    }
}
