import { Device } from "./Device";

export class Television implements Device {
    private isOn: boolean;
    private volume: number;
    private channel: number;

    constructor() {
        this.isOn = false;
        this.volume = 50; // Default volume
        this.channel = 1; // Default channel
    }

    public powerOn(): void {
        this.isOn = true;
        console.log("Television powered on");
    }

    public powerOff(): void {
        this.isOn = false;
        console.log("Television powered off");
    }

    public adjustVolume(volume: number): void {
        this.volume = volume;
        console.log(`Adjusting television volume to ${volume}`);
    }

    public changeChannel(channel: number): void {
        this.channel = channel;
        console.log(`Changing television channel to ${channel}`);
    }
}
