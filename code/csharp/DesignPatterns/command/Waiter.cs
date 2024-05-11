namespace Command;

class Waiter
{
    private ICommand _command;

    public ICommand Command
    {
        get => _command;
        set
        {
            _command = value;
            System.Console.WriteLine($"Waiter setting command to {value
                                                            .GetType().Name}");
        }
    }

    public void ExecuteCommand()
    {
        System.Console.WriteLine($"Waiter.ExecuteCommand(): " +
            "Delegating to Command.Execute() for " + _command.GetType().Name);

        _command.Execute();
    }
}
