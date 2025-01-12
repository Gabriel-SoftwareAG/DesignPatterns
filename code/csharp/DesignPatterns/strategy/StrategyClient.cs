namespace Strategy;
using System;

public class StrategyClient
{
    public static void StrategyExample()
    {
        RoutePlanner planner = new RoutePlanner();

        // Set the strategy to calculate the fastest route
        planner.SetStrategy(new FastestRouteStrategy());
        planner.ExecuteStrategy();

        // Set the strategy to calculate the shortest route
        planner.SetStrategy(new ShortestRouteStrategy());
        planner.ExecuteStrategy();
    }
}
