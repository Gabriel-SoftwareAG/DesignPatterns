package mediator;

class Tester extends Colleague {
    public Tester(Team team) {
        super(team);
    }

    @Override
    public void send(String message) {
        System.out.println("Tester sending message: " + message);
        team.request(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Tester received task: " + message);
    }
}
