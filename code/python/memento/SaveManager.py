class SaveManager:
    def __init__(self):
        self._saved_states = []

    def add(self, game_state):
        self._saved_states.append(game_state)

    def get(self, index):
        return self._saved_states[index]
