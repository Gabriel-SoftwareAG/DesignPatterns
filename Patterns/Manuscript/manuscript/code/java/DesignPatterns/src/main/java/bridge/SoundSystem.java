package bridge;

class SoundSystem implements Device {
    private boolean isOn;
    private int volume;

    public SoundSystem() {
        this.isOn = false;
        this.volume = 50; // Default volume
    }

    public void powerOn() {
        isOn = true;
        System.out.println("Sound system powered on");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Sound system powered off");
    }

    public void adjustVolume(int volume) {
        this.volume = volume;
        System.out.println("Adjusting sound system volume to " + volume);
    }

    public void changeChannel(int channel) {
        // Sound system does not have channels
        System.out.println("Sound system does not have channels");
    }
}
