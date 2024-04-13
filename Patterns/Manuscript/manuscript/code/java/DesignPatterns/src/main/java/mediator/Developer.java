package mediator;

class Developer extends Colleague {
    public Developer(Team team) {
        super(team);
    }

    @Override
    public void send(String message) {
        System.out.println("Developer sending message: " + message);
        team.request(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Developer received task: " + message);
    }
}
