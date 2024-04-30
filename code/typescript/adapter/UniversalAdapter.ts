import { ElectricalOutlet } from "./ElectricalOutlet";
import { MobilePhone } from "./MobilePhone";

export class UniversalAdapter implements ElectricalOutlet {
    private device: MobilePhone;

    constructor(device: MobilePhone) {
        this.device = device;
    }

    request(): void {
        console.log("Converting electrical power to device");
        this.device.specificRequest();
    }
}
