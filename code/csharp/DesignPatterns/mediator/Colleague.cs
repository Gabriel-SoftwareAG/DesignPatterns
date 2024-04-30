namespace Mediator;

abstract class Colleague
{
    protected IMediator Mediator;

    protected Colleague(IMediator mediator)
    {
        Mediator = mediator;
    }

    public abstract void Send(string message);
    public abstract void Receive(string message);
}
