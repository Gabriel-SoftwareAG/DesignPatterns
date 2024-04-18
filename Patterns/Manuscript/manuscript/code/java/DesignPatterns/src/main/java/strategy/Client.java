package strategy;

class Client {
    public static void main(String[] args) {
        RoutePlanner planner = new RoutePlanner();

        // Set the strategy to calculate the fastest route
        planner.setStrategy(new FastestRouteStrategy());
        planner.executeStrategy();

        // Set the strategy to calculate the shortest route
        planner.setStrategy(new ShortestRouteStrategy());
        planner.executeStrategy();
    }
}
