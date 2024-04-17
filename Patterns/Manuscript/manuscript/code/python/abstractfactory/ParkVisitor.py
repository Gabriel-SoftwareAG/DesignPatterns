from AdventureLandFactory import AdventureLandFactory
from FantasyLandFactory import FantasyLandFactory

if __name__ == "__main__":
    # Choose themed area (factory)
    adventureLandFactory = AdventureLandFactory()
    fantasyLandFactory = FantasyLandFactory()

    # Order themed food items
    tropicalIceCream = adventureLandFactory.createIceCream()
    exoticPizza = adventureLandFactory.createPizza()

    magicalIceCream = fantasyLandFactory.createIceCream()
    enchantedPizza = fantasyLandFactory.createPizza()

    # Enjoy themed food items
    tropicalIceCream.enjoy()
    exoticPizza.enjoy()
    magicalIceCream.enjoy()
    enchantedPizza.enjoy()
