public class Waiter
{
    private ICommand _command;

    public void SetCommand(ICommand command)
    {
        _command = command;
    }

    public void ExecuteCommand()
    {
        System.Console.WriteLine($"Waiter.ExecuteCommand(): Delegating to Command.Execute() for {_command.GetType().Name}");
        _command.Execute();
    }
}

