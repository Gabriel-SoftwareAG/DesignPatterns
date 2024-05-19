import { RemoteControl } from './RemoteControl';
import { Device } from './Device';

export class AdvancedRemoteControl extends RemoteControl {
    constructor(device: Device) {
        super(device);
    }

    mute(): void {
        this.device.adjustVolume(0);
    }
}
