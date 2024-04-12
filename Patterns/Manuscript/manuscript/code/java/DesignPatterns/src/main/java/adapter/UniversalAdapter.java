package adapter;

class UniversalAdapter implements ElectricalOutlet {
    private ElectronicDevice device;

    UniversalAdapter(ElectronicDevice device) {
        this.device = device;
    }

    public void request() {
        device.specificRequest();
    }
}