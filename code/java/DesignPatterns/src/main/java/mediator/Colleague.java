package mediator;

abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator team) {
        this.mediator = team;
    }

    abstract void send(String message);

    abstract void receive(String message);
}