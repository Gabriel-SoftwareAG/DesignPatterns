namespace State;
using System;

class TrafficLight
{
    private IState _currentState;

    public TrafficLight(IState state)
    {
        this._currentState = state;
    }

    public void Perform()
    {
        _currentState.HandleRequest();
        // Logic to change the current state
    }

    public void SetState(IState state)
    {
        this._currentState = state;
    }
}
