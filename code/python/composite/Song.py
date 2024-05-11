from PlaylistComponent import PlaylistComponent


class Song(PlaylistComponent):
    def __init__(self, title):
        self.title = title

    def play_song(self):
        print(f"Playing song: {self.title}")
