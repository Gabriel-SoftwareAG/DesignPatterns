from PlaylistComponent import PlaylistComponent


class Playlist(PlaylistComponent):
    def __init__(self):
        self.components = []

    def add_component(self, component):
        self.components.append(component)

    def remove_component(self, component):
        self.components.remove(component)

    def play_song(self):
        print("Playing playlist:")
        for component in self.components:
            component.play_song()
