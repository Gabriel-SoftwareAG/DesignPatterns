from PizzaDecorator import PizzaDecorator


class MushroomDecorator(PizzaDecorator):
    def __init__(self, pizza):
        super().__init__(pizza)

    def bake(self):
        super().bake()
        print("Adding mushrooms")
