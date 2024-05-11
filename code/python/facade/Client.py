from ControlPanel import ControlPanel

if __name__ == "__main__":
    control_panel = ControlPanel()

    control_panel.park()
    control_panel.activate_cruise_control()
    control_panel.avoid_collision()

    # Tie all actions together - take me home
    control_panel.drive_to_home_and_park()
