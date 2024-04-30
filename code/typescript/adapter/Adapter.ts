import { MobilePhone } from "./MobilePhone";
import { UniversalAdapter } from "./UniversalAdapter";

export function Adapter(): void {
    // Create electronic device
    const device = new MobilePhone();

    // Create universal adapter
    const adapter = new UniversalAdapter(device);

    // Connect device to electrical outlet and charge
    adapter.request();
}
