package composite;

public class MusicPlayer {
    public static void main(String[] args) {
        // Create individual songs
        Song song1 = new Song("Song 1");
        Song song2 = new Song("Song 2");

        // Create playlist and add songs
        Playlist playlist = new Playlist();
        playlist.addComponent(song1);
        playlist.addComponent(song2);

        // Play playlist
        playlist.operation();
    }
}