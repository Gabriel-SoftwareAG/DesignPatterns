package adapter;

public class Traveler {
    public static void main(String[] args) {
        // Create electronic device
        ElectronicDevice device = new ElectronicDevice();

        // Create universal adapter
        UniversalAdapter adapter = new UniversalAdapter(device);

        // Connect device to electrical outlet and charge
        adapter.request();
    }
}