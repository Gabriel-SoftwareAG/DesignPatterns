public class SupportTicket
{
    public int Level { get; }
    public string Description { get; }

    public SupportTicket(int level, string description)
    {
        Level = level;
        Description = description;
    }
}
