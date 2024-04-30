public class PreparePizzaCommand : ICommand
{
    private Receiver _receiver;

    public PreparePizzaCommand(Receiver receiver)
    {
        _receiver = receiver;
    }

    public void Execute()
    {
        System.Console.WriteLine("PreparePizzaCommand.Execute(): Delegating to Receiver.PreparePizza()");
        _receiver.PreparePizza();
    }
}
