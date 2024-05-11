from Prototype import Prototype


class BlackTeddyBearPrototype(Prototype):
    def clone(self):
        print("Cloning Black Teddy Bear")
        return BlackTeddyBearPrototype()
