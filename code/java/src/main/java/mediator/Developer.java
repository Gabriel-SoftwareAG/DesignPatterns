package mediator;

class Developer extends Colleague {
    public Developer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Developer sending message: " + message);
        mediator.request(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Developer received task: " + message);
    }
}
