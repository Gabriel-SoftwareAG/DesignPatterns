namespace Mediator;

class Tester : Colleague
{
    public Tester(IMediator mediator) : base(mediator) { }

    public override void Send(string message)
    {
        System.Console.WriteLine($"Tester sending message: {message}");
        Mediator.Request(message, this);
    }

    public override void Receive(string message)
    {
        System.Console.WriteLine($"Tester received task: {message}");
    }
}
