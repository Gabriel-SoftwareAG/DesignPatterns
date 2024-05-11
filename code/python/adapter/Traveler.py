from adapter.MobilePhone import MobilePhone
from adapter.UniversalAdapter import UniversalAdapter

# To run the code
if __name__ == "__main__":
    # Create electronic device
    device = MobilePhone()

    # Create universal adapter
    adapter = UniversalAdapter(device)

    # Connect device to electrical outlet and charge
    adapter.request()
