
from PlainCheesePizza import PlainCheesePizza
from TomatoDecorator import TomatoDecorator
from MushroomDecorator import MushroomDecorator

def main():
    plain_cheese_pizza = PlainCheesePizza()

    # Adding tomatoes to the pizza
    tomato_pizza = TomatoDecorator(plain_cheese_pizza)
    tomato_pizza.bake()

    # Adding mushrooms to the pizza
    mushroom_pizza = MushroomDecorator(plain_cheese_pizza)
    mushroom_pizza.bake()

    # Adding both tomatoes and mushrooms to the pizza
    deluxe_pizza = MushroomDecorator(TomatoDecorator(plain_cheese_pizza))
    deluxe_pizza.bake()

if __name__ == "__main__":
    main()
