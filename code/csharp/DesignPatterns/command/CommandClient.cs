namespace Command;
using System;

public class CommandClient
{
    public static void CommandExample()
    {
        // Create receiver (kitchen staff)
        Receiver chef = new Receiver();

        // Create concrete commands (orders)
        ICommand preparePizzaCommand = new PreparePizzaCommand(chef);
        ICommand servePastaCommand = new ServePastaCommand(chef);

        // Create invoker (waiter)
        Waiter waiter = new Waiter();

        // Set and execute commands
        waiter.Command = preparePizzaCommand;
        waiter.ExecuteCommand();

        waiter.Command = servePastaCommand;
        waiter.ExecuteCommand();
    }
}
