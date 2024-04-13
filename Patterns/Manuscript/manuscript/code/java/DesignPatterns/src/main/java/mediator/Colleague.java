package mediator;

abstract class Colleague {
    protected Team team;

    public Colleague(Team team) {
        this.team = team;
    }

    abstract void send(String message);

    abstract void receive(String message);
}