package mediator;

class ScrumMaster implements Mediator {
    private Developer developer;
    private Tester tester;

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public void setTester(Tester tester) {
        this.tester = tester;
    }

    @Override
    public void request(String message, Colleague colleague) {
        if (colleague == developer) {
            tester.receive(message);
        } else if (colleague == tester) {
            developer.receive(message);
        }
    }

    @Override
    public void response(String message, Colleague colleague) {
        System.out.println("Scrum Master handling response: " + message);
    }
}
