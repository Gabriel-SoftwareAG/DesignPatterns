package composite;

class Song implements PlaylistComponent {
    private String title;

    Song(String title) {
        this.title = title;
    }

    @Override
    public void playSong() {
        // Perform song-specific operation, such as playing
        System.out.println("Playing song: " + title);
    }
}