from Exhibit import Exhibit

class Painting(Exhibit):
    def accept(self, visitor):
        visitor.visit_painting(self)
