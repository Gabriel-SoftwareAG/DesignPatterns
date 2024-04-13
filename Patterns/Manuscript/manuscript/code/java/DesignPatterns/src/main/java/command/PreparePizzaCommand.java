package command;

class PreparePizzaCommand implements Command {
    private Receiver receiver;

    PreparePizzaCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.preparePizza();
    }
}
