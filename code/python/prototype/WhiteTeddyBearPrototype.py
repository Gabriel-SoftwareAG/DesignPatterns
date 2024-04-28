from Prototype import Prototype

class WhiteTeddyBearPrototype(Prototype):
    def clone(self):
        print("Cloning White Teddy Bear")
        return WhiteTeddyBearPrototype()
