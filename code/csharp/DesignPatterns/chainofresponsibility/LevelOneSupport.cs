public class LevelOneSupport : ISupportLevel
{
    private ISupportLevel _next;

    public void SetNext(ISupportLevel next)
    {
        _next = next;
        Console.WriteLine($"Level one support setting next level to {next.GetType().Name} Support");
    }

    public void HandleRequest(SupportTicket ticket)
    {
        if (ticket.Level <= 1)
        {
            Console.WriteLine($"Level One Support handling ticket: {ticket.Description}");
            Console.WriteLine("Ticket resolved.");
        }
        else
        {
            Console.WriteLine($"Level One Support cannot handle ticket: {ticket.Description} Escalating to next level.");
            _next.HandleRequest(ticket);
            Console.WriteLine("Ticket returned to level one after being resolved.");
        }
    }
}
