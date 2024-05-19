import { Device } from './Device';

export abstract class RemoteControl implements Device {
    protected device: Device;

    constructor(device: Device) {
        this.device = device;
    }

    powerOn(): void {
        this.device.powerOn();
    }

    powerOff(): void {
        this.device.powerOff();
    }

    adjustVolume(volume: number): void {
        this.device.adjustVolume(volume);
    }

    changeChannel(channel: number): void {
        this.device.changeChannel(channel);
    }
}
