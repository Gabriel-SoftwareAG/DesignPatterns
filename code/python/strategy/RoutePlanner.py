class RoutePlanner:
    def __init__(self):
        self.strategy = None

    def set_strategy(self, strategy):
        self.strategy = strategy
        print(f"Setting the strategy to calculate the route: {type(self.strategy).__name__}")

    def execute_strategy(self):
        print(f"Executing the strategy to calculate the route for {type(self.strategy).__name__}")
        self.strategy.calculate_route()
