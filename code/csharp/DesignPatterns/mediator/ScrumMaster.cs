namespace Mediator;

class ScrumMaster : IMediator
{
    private Developer _developer;
    private Tester _tester;

    public void SetDeveloper(Developer developer)
    {
        _developer = developer;
    }

    public void SetTester(Tester tester)
    {
        _tester = tester;
    }

    public void Request(string message, Colleague colleague)
    {
        if (colleague == _developer)
        {
            _tester.Receive(message);
        }
        else if (colleague == _tester)
        {
            _developer.Receive(message);
        }
    }

    public void Response(string message, Colleague colleague)
    {
        System.Console.WriteLine($"Scrum Master handling response: {message}");
    }
}
