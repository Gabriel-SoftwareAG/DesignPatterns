namespace Strategy;
using System;

class RoutePlanner
{
    private IRouteStrategy _strategy;

    public void SetStrategy(IRouteStrategy strategy)
    {
        Console.WriteLine("Setting the strategy to calculate the route: " 
                                                    + strategy.GetType().Name);
        this._strategy = strategy;
    }

    public void ExecuteStrategy()
    {
        Console.WriteLine("Executing the strategy to calculate the route for " 
                                                    + _strategy.GetType().Name);
        _strategy.CalculateRoute();
    }
}
