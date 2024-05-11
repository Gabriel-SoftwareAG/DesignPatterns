import { PlaylistComponent } from "./PlaylistComponent";

export class Playlist implements PlaylistComponent {
    private components: PlaylistComponent[] = [];

    addComponent(component: PlaylistComponent): void {
        this.components.push(component);
    }

    removeComponent(component: PlaylistComponent): void {
        const index = this.components.indexOf(component);
        if (index !== -1) {
            this.components.splice(index, 1);
        }
    }

    playSong(): void {
        console.log("Playing playlist:");
        this.components.forEach(component => {
            component.playSong();
        });
    }
}
