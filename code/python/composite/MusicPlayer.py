
from Song import Song
from Playlist import Playlist

def main():
    # Create individual songs
    song1 = Song("Song 1")
    song2 = Song("Song 2")
    song3 = Song("Song 3")
    song4 = Song("Song 4")

    # Create playlists and add songs
    playlist1 = Playlist()
    playlist2 = Playlist()

    playlist1.add_component(song1)
    playlist1.add_component(song2)

    playlist2.add_component(song3)
    playlist2.add_component(song4)

    # Add playlist to another playlist
    playlist1.add_component(playlist2)

    # Play playlist
    playlist1.play_song()

if __name__ == "__main__":
    main()
