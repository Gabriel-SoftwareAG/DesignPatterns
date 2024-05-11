import { PlaylistComponent } from "./PlaylistComponent";

export class Song implements PlaylistComponent {
    private title: string;

    constructor(title: string) {
        this.title = title;
    }

    playSong(): void {
        console.log(`Playing song: ${this.title}`);
    }
}
