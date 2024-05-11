from PizzaStall import PizzaStall
from IceCreamStall import IceCreamStall

if __name__ == "__main__":
    pizza_stall = PizzaStall()
    ice_cream_stall = IceCreamStall()

    pizza = pizza_stall.take_order()
    ice_cream = ice_cream_stall.take_order()
