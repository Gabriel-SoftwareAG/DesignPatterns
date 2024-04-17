package mediator;

class Tester extends Colleague {
    public Tester(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Tester sending message: " + message);
        mediator.request(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Tester received task: " + message);
    }
}
