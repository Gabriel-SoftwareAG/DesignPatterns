namespace State;
using System;

class TrafficLight
{
    private IState currentState;

    public TrafficLight(IState state)
    {
        this.currentState = state;
    }

    public void Perform()
    {
        currentState.HandleRequest();
        // Logic to change the current state
    }

    public void SetState(IState state)
    {
        this.currentState = state;
    }
}
