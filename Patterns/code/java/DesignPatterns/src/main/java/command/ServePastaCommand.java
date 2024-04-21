package command;

class ServePastaCommand implements Command {
    private Receiver receiver;

    ServePastaCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ServePastaCommand.execute(): Delegating to Receiver.servePasta()");
        receiver.servePasta();
    }
}