from State import State


class RedState(State):
    def handle_request(self):
        print("Red light - Stop!")
        # Logic to switch to the green light (not implemented)
