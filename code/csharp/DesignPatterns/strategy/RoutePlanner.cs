using System;

namespace Strategy
{
    public class RoutePlanner
    {
        private IRouteStrategy strategy;

        public void SetStrategy(IRouteStrategy strategy)
        {
            Console.WriteLine("Setting the strategy to calculate the route: " + strategy.GetType().Name);
            this.strategy = strategy;
        }

        public void ExecuteStrategy()
        {
            Console.WriteLine("Executing the strategy to calculate the route for " + strategy.GetType().Name);
            strategy.CalculateRoute();
        }
    }
}
