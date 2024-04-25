package bridge;

class Television implements Device {
    private boolean isOn;
    private int volume;
    private int channel;

    public Television() {
        this.isOn = false;
        this.volume = 50; // Default volume
        this.channel = 1; // Default channel
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Television powered on");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Television powered off");
    }

    @Override
    public void adjustVolume(int volume) {
        this.volume = volume;
        System.out.println("Adjusting television volume to " + volume);
    }

    @Override
    public void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("Changing television channel to " + channel);
    }
}
