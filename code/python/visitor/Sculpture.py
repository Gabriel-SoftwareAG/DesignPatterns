from Exhibit import Exhibit


class Sculpture(Exhibit):
    def accept(self, visitor):
        visitor.visit_sculpture(self)
