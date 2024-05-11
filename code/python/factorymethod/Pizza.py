from Product import Product


class Pizza(Product):
    def serve(self):
        print("Pizza served")
        return self
