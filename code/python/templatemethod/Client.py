from ModernHouseBuilder import ModernHouseBuilder
from TraditionalHouseBuilder import TraditionalHouseBuilder

if __name__ == "__main__":
    modern_builder = ModernHouseBuilder()
    modern_builder.build_house()

    print("----------")

    traditional_builder = TraditionalHouseBuilder()
    traditional_builder.build_house()
