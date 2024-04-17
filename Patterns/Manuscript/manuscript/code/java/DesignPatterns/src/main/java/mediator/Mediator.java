package mediator;

interface Mediator {
    void request(String message, Colleague colleague);
    void response(String message, Colleague colleague);
}