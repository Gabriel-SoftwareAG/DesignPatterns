from MagicalIceCream import MagicalIceCream
from EnchantedPizza import EnchantedPizza
from AbstractFoodStallFactory import AbstractFoodStallFactory


class FantasyLandFactory(AbstractFoodStallFactory):
    def createIceCream(self):
        print("Creating magical-themed ice cream")
        return MagicalIceCream()

    def createPizza(self):
        print("Creating enchanted-themed pizza")
        return EnchantedPizza()
