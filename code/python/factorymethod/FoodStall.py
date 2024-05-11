from abc import ABC, abstractmethod


class FoodStall(ABC):
    @abstractmethod
    def prepare_food(self):
        pass

    def take_order(self):
        print(f"Order placed at {type(self).__name__}!")
        product = self.prepare_food()
        return product.serve()
