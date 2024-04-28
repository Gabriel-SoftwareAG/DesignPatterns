
from Pizza import Pizza

class PizzaDecorator(Pizza):
    def __init__(self, pizza):
        self.pizza = pizza

    def bake(self):
        self.pizza.bake()
