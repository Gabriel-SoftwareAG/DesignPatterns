package chainofresponsibility;

class LevelOneSupport implements SupportLevel {
    private SupportLevel next;

    @Override
    public void setNext(SupportLevel next) {

        System.out.println("Level one support setting next level to " + next.getClass().getSimpleName() + " Support");
        this.next = next;
    }

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getLevel() <= 1) {
            System.out.println("Level One Support handling ticket: " + ticket.getDescription());
            System.out.println("Ticket resolved.");
        } else {
            System.out.println("Level One Support cannot handle ticket: " + ticket.getDescription() + " Escalating to next level.");
            next.handleRequest(ticket);
            System.out.println("Ticket returned to level one after being resolved.");
        }
    }
}
