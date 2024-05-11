export interface Device {
    powerOn(): void;
    powerOff(): void;
    adjustVolume(volume: number): void;
    changeChannel(channel: number): void;
}
