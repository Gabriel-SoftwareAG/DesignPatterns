from Player import Player
from SaveManager import SaveManager

if __name__ == "__main__":
    player = Player()
    save_manager = SaveManager()

    # Player progresses in the game
    player.set_state("Level 1")
    save_manager.add(player.save_state_to_memento())
    print(f"Player saved state state: {player.get_state()}")

    # Player reaches a checkpoint
    player.set_state("Level 2")
    save_manager.add(player.save_state_to_memento())
    print(f"Player saved state state: {player.get_state()}")

    # Player wants to revert to the previous state
    player.get_state_from_memento(save_manager.get(0))
    print(f"Player reverted to state: {player.get_state()}")
