package adapter;

class Traveler {
    public static void main(String[] args) {
        // Create electronic device
        MobilePhone device = new MobilePhone();

        // Create universal adapter
        UniversalAdapter adapter = new UniversalAdapter(device);

        // Connect device to electrical outlet and charge
        adapter.request();
    }
}