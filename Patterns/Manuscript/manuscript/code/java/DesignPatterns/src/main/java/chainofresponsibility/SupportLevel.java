package chainofresponsibility;

interface SupportLevel {
    void setNext(SupportLevel next);
    void handleRequest(SupportTicket ticket);
}
