import { Player } from "./Player";
import { SaveManager } from "./SaveManager";

export function Memento(): void {
    let player = new Player();
    let saveManager = new SaveManager();

    player.setState("Level 1");
    saveManager.add(player.saveStateToMemento());
    console.log(`Player saved state: ${player.getState()}`);

    player.setState("Level 2");
    saveManager.add(player.saveStateToMemento());
    console.log(`Player saved state: ${player.getState()}`);

    player.getStateFromMemento(saveManager.get(0));
    console.log(`Player reverted to state: ${player.getState()}`);
}
