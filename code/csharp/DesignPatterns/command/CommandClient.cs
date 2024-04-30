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
        waiter.SetCommand(preparePizzaCommand);
        waiter.ExecuteCommand();

        waiter.SetCommand(servePastaCommand);
        waiter.ExecuteCommand();
    }
}
