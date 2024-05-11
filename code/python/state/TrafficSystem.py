from TrafficLight import TrafficLight
from GreenState import GreenState
from YellowState import YellowState
from RedState import RedState

if __name__ == "__main__":
    light = TrafficLight(GreenState())

    # Green
    light.perform()

    # Green to Yellow
    light.set_state(YellowState())
    light.perform()

    # Yellow to Red
    light.set_state(RedState())
    light.perform()
