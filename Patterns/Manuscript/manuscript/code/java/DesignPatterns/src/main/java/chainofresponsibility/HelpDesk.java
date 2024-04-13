package chainofresponsibility;

public class HelpDesk {
    public static void main(String[] args) {
        LevelOneSupport levelOne = new LevelOneSupport();
        LevelTwoSupport levelTwo = new LevelTwoSupport();

        levelOne.setNext(levelTwo);

        SupportTicket ticket = new SupportTicket(1, "Cannot connect to the internet.");
        levelOne.handleRequest(ticket);

        SupportTicket anotherTicket = new SupportTicket(2, "Computer does not start.");
        levelOne.handleRequest(anotherTicket);
    }
}
