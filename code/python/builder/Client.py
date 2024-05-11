from ConcreteBuilder import ConcreteBuilder
from Director import Director

if __name__ == "__main__":
    builder = ConcreteBuilder()
    director = Director(builder)
    director.construct_sandwich()
    sandwich = builder.get_product()
    sandwich.show()
