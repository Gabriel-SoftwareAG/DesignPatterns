import { IPlaylistComponent } from "./IPlaylistComponent";

export class Song implements IPlaylistComponent {
    private title: string;

    constructor(title: string) {
        this.title = title;
    }

    playSong(): void {
        console.log(`Playing song: ${this.title}`);
    }
}
