class SupportTicket:
    def __init__(self, level, description):
        self.level = level
        self.description = description

    def get_level(self):
        return self.level

    def get_description(self):
        return self.description
