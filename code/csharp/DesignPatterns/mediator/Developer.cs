namespace Mediator;

class Developer : Colleague
{
    public Developer(IMediator mediator) : base(mediator) { }

    public override void Send(string message)
    {
        System.Console.WriteLine($"Developer sending message: {message}");
        _mediator.Request(message, this);
    }

    public override void Receive(string message)
    {
        System.Console.WriteLine($"Developer received task: {message}");
    }
}
