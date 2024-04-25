package bridge;

abstract class RemoteControl implements  Device{
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        device.powerOn();
    }

    @Override
    public void powerOff() {
        device.powerOff();
    }

    @Override
    public void adjustVolume(int volume) {
        device.adjustVolume(volume);
    }

    @Override
    public void changeChannel(int channel) {
        device.changeChannel(channel);
    }
}