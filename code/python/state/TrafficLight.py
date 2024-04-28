class TrafficLight:
    def __init__(self, state):
        self.current_state = state

    def perform(self):
        self.current_state.handle_request()
        # Logic to change the current state (not implemented)

    def set_state(self, state):
        self.current_state = state
