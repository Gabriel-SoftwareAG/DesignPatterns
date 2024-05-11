from abc import ABC, abstractmethod


class PlaylistComponent(ABC):
    @abstractmethod
    def play_song(self):
        pass
