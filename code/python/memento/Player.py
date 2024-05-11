from GameState import GameState


class Player:
    def __init__(self):
        self._state = ""

    def set_state(self, state):
        self._state = state

    def get_state(self):
        return self._state

    def save_state_to_memento(self):
        return GameState(self._state)

    def get_state_from_memento(self, game_state):
        self._state = game_state.get_state()
