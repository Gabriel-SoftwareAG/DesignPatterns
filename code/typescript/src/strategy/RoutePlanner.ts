import { RouteStrategy } from "./RouteStrategy";

export class RoutePlanner {
    private strategy!: RouteStrategy;

    setStrategy(strategy: RouteStrategy): void {
        console.log("Setting the strategy to calculate the route: " + strategy.constructor.name);
        this.strategy = strategy;
    }

    executeStrategy(): void {
        console.log("Executing the strategy to calculate the route for " + this.strategy.constructor.name);
        this.strategy.calculateRoute();
    }
}
