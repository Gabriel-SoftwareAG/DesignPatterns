from State import State

class GreenState(State):
    def handle_request(self):
        print("Green light - Go!")
        # Logic to switch to the yellow light (not implemented)
