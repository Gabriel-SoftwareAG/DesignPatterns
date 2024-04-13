package bridge;

class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void powerOn() {
        device.powerOn();
    }

    public void powerOff() {
        device.powerOff();
    }

    public void adjustVolume(int volume) {
        device.adjustVolume(volume);
    }

    public void changeChannel(int channel) {
        device.changeChannel(channel);
    }
}