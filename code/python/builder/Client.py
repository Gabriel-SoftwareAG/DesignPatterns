from ConcreteBuilder import ConcreteBuilder
from Director import Director

def main():
    builder = ConcreteBuilder()
    director = Director(builder)
    director.construct_sandwich()
    sandwich = builder.get_product()
    sandwich.show()

if __name__ == "__main__":
    main()
