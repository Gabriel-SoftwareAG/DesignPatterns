package chainofresponsibility;

class LevelTwoSupport implements SupportLevel {
    private SupportLevel next;

    @Override
    public void setNext(SupportLevel next) {

        System.out.println("Setting next level to " + next.getClass().getSimpleName() + " Support");
        this.next = next;
    }

    @Override
    public void handleRequest(SupportTicket ticket) {
        System.out.println("Level Two Support handling ticket: " + ticket.getDescription());
        System.out.println("Ticket resolved.");
    }
}
