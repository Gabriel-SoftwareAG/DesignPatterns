from BlackTeddyBearPrototype import BlackTeddyBearPrototype
from WhiteTeddyBearPrototype import WhiteTeddyBearPrototype

def main():
    # Create concrete prototype instances
    teddy_bear1 = WhiteTeddyBearPrototype()
    teddy_bear2 = BlackTeddyBearPrototype()

    # Clone teddy bears
    cloned_teddy_bear1 = teddy_bear1.clone()
    cloned_teddy_bear2 = teddy_bear2.clone()

    # Display the cloned teddy bears
    print("Cloned Teddy Bear 1:", type(cloned_teddy_bear1).__name__)
    print("Cloned Teddy Bear 2:", type(cloned_teddy_bear2).__name__)

if __name__ == "__main__":
    main()
