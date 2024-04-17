from TropicalIceCream import TropicalIceCream
from ExoticPizza import ExoticPizza
from AbstractFoodStallFactory import AbstractFoodStallFactory


class AdventureLandFactory(AbstractFoodStallFactory):
    def createIceCream(self):
        print("Creating tropical-themed ice cream")
        return TropicalIceCream()

    def createPizza(self):
        print("Creating exotic-themed pizza")
        return ExoticPizza()
