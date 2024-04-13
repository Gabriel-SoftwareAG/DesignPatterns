package bridge;

public interface Device {
    void powerOn();

    void powerOff();

    void adjustVolume(int volume);

    void changeChannel(int channel);
}