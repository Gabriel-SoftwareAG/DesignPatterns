namespace State;
using System;

class GreenState : IState
{
    public void HandleRequest()
    {
        Console.WriteLine("Green light - Go!");
        // Logic to switch to the yellow light
    }
}
