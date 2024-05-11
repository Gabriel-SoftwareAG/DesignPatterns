from Product import Product


class IceCream(Product):
    def serve(self):
        print("Ice cream served")
        return self
