import { IPlaylistComponent } from "./IPlaylistComponent";

export class Playlist implements IPlaylistComponent {
    private components: IPlaylistComponent[] = [];

    addComponent(component: IPlaylistComponent): void {
        this.components.push(component);
    }

    removeComponent(component: IPlaylistComponent): void {
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
