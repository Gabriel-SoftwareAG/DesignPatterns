package composite;

public class MusicPlayer {
    public static void main(String[] args) {
        // Create individual songs
        Song song1 = new Song("Song 1");
        Song song2 = new Song("Song 2");
        Song song3 = new Song("Song 3");
        Song song4 = new Song("Song 4");

        // Create playlist and add songs
        Playlist playlist1 = new Playlist();
        Playlist playlist2 = new Playlist();

        // Add songs to playlist
        playlist1.addComponent(song1);
        playlist1.addComponent(song2);

        playlist2.addComponent(song3);
        playlist2.addComponent(song4);

        // Add playlist to playlist
        playlist1.addComponent(playlist2);

        // Play playlist
        playlist1.playSong();
    }
}