import { RemoteControl } from './RemoteControl';
import { Device } from './Device';

export class RegularRemoteControl extends RemoteControl {
    constructor(device: Device) {
        super(device);
    }
}
