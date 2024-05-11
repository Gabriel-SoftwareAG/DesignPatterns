from Visitor import Visitor


class Patron(Visitor):
    def visit_painting(self, painting):
        print("Patron admires the painting")

    def visit_sculpture(self, sculpture):
        print("Patron examines the sculpture")
