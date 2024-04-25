package composite;

import java.util.ArrayList;
import java.util.List;

class Playlist implements PlaylistComponent {
    private List<PlaylistComponent> components;

    Playlist() {
        this.components = new ArrayList<>();
    }

    void addComponent(PlaylistComponent component) {
        components.add(component);
    }

    void removeComponent(PlaylistComponent component) {
        components.remove(component);
    }

    @Override
    public void playSong() {
        // Perform playlist-specific operation, such as playing all songs
        System.out.println("Playing playlist:");
        for (PlaylistComponent component : components) {
            component.playSong();
        }
    }
}