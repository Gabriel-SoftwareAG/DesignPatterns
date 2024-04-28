from ModernHouseBuilder import ModernHouseBuilder
from TraditionalHouseBuilder import TraditionalHouseBuilder

def main():
    modern_builder = ModernHouseBuilder()
    modern_builder.build_house()

    print("----------")

    traditional_builder = TraditionalHouseBuilder()
    traditional_builder.build_house()

if __name__ == "__main__":
    main()
