package command;

public class Client {
    public static void main(String[] args) {
        // Create receiver (kitchen staff)
        Receiver chef = new Receiver();

        // Create concrete commands (orders)
        Command preparePizzaCommand = new PreparePizzaCommand(chef);
        Command servePastaCommand = new ServePastaCommand(chef);

        // Create invoker (waiter)
        Waiter waiter = new Waiter();

        // Set and execute commands
        waiter.setCommand(preparePizzaCommand);
        waiter.executeCommand();

        waiter.setCommand(servePastaCommand);
        waiter.executeCommand();
    }
}
