from adapter.MobilePhone import MobilePhone
from adapter.UniversalAdapter import UniversalAdapter


class Traveler:
    def main(self):
        # Create electronic device
        device = MobilePhone()

        # Create universal adapter
        adapter = UniversalAdapter(device)

        # Connect device to electrical outlet and charge
        adapter.request()

# To run the code
if __name__ == "__main__":
    traveler = Traveler()
    traveler.main()