from RoutePlanner import RoutePlanner
from FastestRouteStrategy import FastestRouteStrategy
from ShortestRouteStrategy import ShortestRouteStrategy

def main():
    planner = RoutePlanner()

    # Set the strategy to calculate the fastest route
    planner.set_strategy(FastestRouteStrategy())
    planner.execute_strategy()

    # Set the strategy to calculate the shortest route
    planner.set_strategy(ShortestRouteStrategy())
    planner.execute_strategy()

if __name__ == "__main__":
    main()
