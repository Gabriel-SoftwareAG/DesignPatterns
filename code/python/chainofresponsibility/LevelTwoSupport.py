from SupportLevel import SupportLevel


class LevelTwoSupport(SupportLevel):
    def __init__(self):
        self.next = None

    def set_next(self, next):
        print(f"Setting next level to {type(next).__name__} Support")
        self.next = next

    def handle_request(self, ticket):
        print(f"Level Two Support handling ticket: {ticket.get_description()}")
        print("Ticket resolved.")
