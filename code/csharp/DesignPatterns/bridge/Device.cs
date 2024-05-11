namespace Bridge;
interface IDevice
{
    void PowerOn();
    void PowerOff();
    void AdjustVolume(int volume);
    void ChangeChannel(int channel);
}
