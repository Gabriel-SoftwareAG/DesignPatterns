namespace Composite;

class Song : IPlaylistComponent
{
    private string _title;

    public Song(string title)
    {
        _title = title;
    }

    public void PlaySong()
    {
        System.Console.WriteLine($"Playing song: {_title}");
    }
}
