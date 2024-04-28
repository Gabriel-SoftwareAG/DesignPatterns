from Builder import Builder
from Product import Product

class ConcreteBuilder(Builder):
    def __init__(self):
        self.product = Product()

    def build_part_a(self):
        self.product.add_part("Whole Wheat Bread")

    def build_part_b(self):
        self.product.add_part("Turkey")

    def build_part_c(self):
        self.product.add_part("Lettuce, Tomato, Onion")

    def get_product(self):
        return self.product
