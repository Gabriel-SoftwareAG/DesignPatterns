import { Device } from './Device';

export class Television implements Device {
    private isOn: boolean = false;
    private volume: number = 50; // Default volume
    private channel: number = 1; // Default channel

    powerOn(): void {
        this.isOn = true;
        console.log("Television powered on");
    }

    powerOff(): void {
        this.isOn = false;
        console.log("Television powered off");
    }

    adjustVolume(volume: number): void {
        this.volume = volume;
        console.log(`Adjusting television volume to ${volume}`);
    }

    changeChannel(channel: number): void {
        this.channel = channel;
        console.log(`Changing television channel to ${channel}`);
    }
}
