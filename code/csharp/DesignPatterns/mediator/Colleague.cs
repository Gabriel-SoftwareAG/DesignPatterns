namespace Mediator;

abstract class Colleague
{
    protected IMediator _mediator;

    protected Colleague(IMediator mediator)
    {
        _mediator = mediator;
    }

    public abstract void Send(string message);
    public abstract void Receive(string message);
}
