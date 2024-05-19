import { Device } from './Device';

export class SoundSystem implements Device {
    private isOn: boolean = false;
    private volume: number = 50; // Default volume

    powerOn(): void {
        this.isOn = true;
        console.log("Sound system powered on");
    }

    powerOff(): void {
        this.isOn = false;
        console.log("Sound system powered off");
    }

    adjustVolume(volume: number): void {
        this.volume = volume;
        console.log(`Adjusting sound system volume to ${volume}`);
    }

    changeChannel(channel: number): void {
        console.log("Sound system does not have channels");
    }
}
