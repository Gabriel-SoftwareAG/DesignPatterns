namespace Composite;

public class MusicPlayer
{
    public static void CompositeExample()
    {
        // Create individual songs
        Song song1 = new Song("Song 1");
        Song song2 = new Song("Song 2");
        Song song3 = new Song("Song 3");
        Song song4 = new Song("Song 4");

        // Create playlists and add songs
        Playlist playlist1 = new Playlist();
        Playlist playlist2 = new Playlist();

        playlist1.AddComponent(song1);
        playlist1.AddComponent(song2);

        playlist2.AddComponent(song3);
        playlist2.AddComponent(song4);

        // Add playlist to another playlist
        playlist1.AddComponent(playlist2);

        // Play playlist
        playlist1.PlaySong();
    }
}
