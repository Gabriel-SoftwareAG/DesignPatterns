import { IRouteStrategy } from "./RouteStrategy";

export class ShortestRouteStrategy implements IRouteStrategy {
    calculateRoute(): void {
        console.log("Calculating the shortest route...");
        // Implementation for calculating the shortest route
    }
}
