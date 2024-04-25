package command;

class Waiter {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void executeCommand() {
        System.out.println("Waiter.executeCommand(): Delegating to Command.execute() for " + command.getClass().getSimpleName());
        command.execute();
    }
}
