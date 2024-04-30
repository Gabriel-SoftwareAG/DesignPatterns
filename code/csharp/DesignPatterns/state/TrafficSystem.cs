namespace State;
using System;

public class TrafficSystem
{
    public static void StateExample()
    {
        TrafficLight light = new TrafficLight(new GreenState());

        // Green
        light.Perform();

        // Green to Yellow
        light.SetState(new YellowState());
        light.Perform();

        // Yellow to Red
        light.SetState(new RedState());
        light.Perform();
    }
}
