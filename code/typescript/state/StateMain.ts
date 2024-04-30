import { TrafficLight } from "./TrafficLight";
import { GreenState } from "./GreenState";
import { YellowState } from "./YellowState";
import { RedState } from "./RedState";

export function State(): void {
    const light = new TrafficLight(new GreenState());

    // Green
    light.perform();

    // Green to Yellow
    light.setState(new YellowState());
    light.perform();

    // Yellow to Red
    light.setState(new RedState());
    light.perform();
}

// Invoke State function
State();
