package chainofresponsibility;

class LevelOneSupport implements SupportLevel {
    private SupportLevel next;

    @Override
    public void setNext(SupportLevel next) {
        this.next = next;
    }

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getLevel() <= 1) {
            System.out.println("Level One Support handling ticket: " + ticket.getDescription());
        } else {
            next.handleRequest(ticket);
        }
    }
}
