from SupportLevel import SupportLevel

class LevelOneSupport(SupportLevel):
    def __init__(self):
        self.next = None

    def set_next(self, next):
        print(f"Level one support setting next level to {type(next).__name__} Support")
        self.next = next

    def handle_request(self, ticket):
        if ticket.get_level() <= 1:
            print(f"Level One Support handling ticket: {ticket.get_description()}")
            print("Ticket resolved.")
        else:
            print(f"Level One Support cannot handle ticket: {ticket.get_description()} Escalating to next level.")
            self.next.handle_request(ticket)
            print("Ticket returned to level one after being resolved.")
