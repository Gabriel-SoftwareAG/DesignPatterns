package strategy;

class RoutePlanner {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.calculateRoute();
    }
}
