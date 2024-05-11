from FoodStall import FoodStall
from IceCream import IceCream


class IceCreamStall(FoodStall):
    def prepare_food(self):
        print("Ice cream is being prepared")
        return IceCream()
