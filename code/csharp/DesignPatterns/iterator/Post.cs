namespace Iterator;

class Post
{
    public string Title { get; }
    public string Author { get; }
    public string Summary { get; }

    public Post(string title, string author, string summary)
    {
        Title = title;
        Author = author;
        Summary = summary;
    }
}