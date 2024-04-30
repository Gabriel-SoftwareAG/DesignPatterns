using System;

public class HelpDesk
{
    public static void ChainOfResponsibilityExample()
    {
        LevelOneSupport levelOne = new LevelOneSupport();
        LevelTwoSupport levelTwo = new LevelTwoSupport();

        levelOne.SetNext(levelTwo);

        SupportTicket ticket = new SupportTicket(1, "Cannot connect to the internet.");
        levelOne.HandleRequest(ticket);

        SupportTicket anotherTicket = new SupportTicket(2, "Computer does not start.");
        levelOne.HandleRequest(anotherTicket);
    }
}
