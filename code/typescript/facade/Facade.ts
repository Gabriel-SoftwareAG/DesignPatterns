import { ControlPanel } from "./ControlPanel";

export function Facade(): void {
    const controlPanel = new ControlPanel();
    controlPanel.driveToHomeAndPark();
}
