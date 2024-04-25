package bridge;

interface Device {
    void powerOn();

    void powerOff();

    void adjustVolume(int volume);

    void changeChannel(int channel);
}