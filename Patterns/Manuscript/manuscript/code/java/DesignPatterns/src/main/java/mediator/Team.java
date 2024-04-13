package mediator;

interface Team {
    void request(String message, Colleague colleague);
    void response(String message, Colleague colleague);
}