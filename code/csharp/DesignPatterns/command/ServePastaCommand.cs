public class ServePastaCommand : ICommand
{
    private Receiver _receiver;

    public ServePastaCommand(Receiver receiver)
    {
        _receiver = receiver;
    }

    public void Execute()
    {
        System.Console.WriteLine("ServePastaCommand.Execute(): Delegating to Receiver.ServePasta()");
        _receiver.ServePasta();
    }
}

