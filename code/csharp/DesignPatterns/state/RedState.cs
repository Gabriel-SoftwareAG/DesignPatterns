namespace State;
using System;

class RedState : IState
{
    public void HandleRequest()
    {
        Console.WriteLine("Red light - Stop!");
        // Logic to switch to the green light
    }
}
