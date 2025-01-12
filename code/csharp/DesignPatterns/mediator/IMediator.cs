namespace Mediator;

interface IMediator
{
    void Request(string message, Colleague colleague);
    void Response(string message, Colleague colleague);
}
