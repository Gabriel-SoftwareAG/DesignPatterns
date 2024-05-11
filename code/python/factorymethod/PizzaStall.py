from FoodStall import FoodStall
from Pizza import Pizza


class PizzaStall(FoodStall):
    def prepare_food(self):
        print("Pizza is being prepared")
        return Pizza()
