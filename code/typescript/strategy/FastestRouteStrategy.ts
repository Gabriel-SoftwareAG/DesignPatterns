import { IRouteStrategy } from "./RouteStrategy";

export class FastestRouteStrategy implements IRouteStrategy {
    calculateRoute(): void {
        console.log("Calculating the fastest route...");
        // Implementation for calculating the fastest route
    }
}
