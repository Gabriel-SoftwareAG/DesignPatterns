namespace ChainOfResponsibility;

class LevelTwoSupport : ISupportLevel
{
    private ISupportLevel _next;

    public void SetNext(ISupportLevel next)
    {
        _next = next;
        Console.WriteLine($"Setting next level to {next
                                                    .GetType().Name} Support");
    }

    public void HandleRequest(SupportTicket ticket)
    {
        Console.WriteLine($"Level Two Support handling ticket: {ticket
                                                                .Description}");
        Console.WriteLine("Ticket resolved.");
    }
}
