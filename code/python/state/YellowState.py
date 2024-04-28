from State import State

class YellowState(State):
    def handle_request(self):
        print("Yellow light - Caution!")
        # Logic to switch to the red light (not implemented)
