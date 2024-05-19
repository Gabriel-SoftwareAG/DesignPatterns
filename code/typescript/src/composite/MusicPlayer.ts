import { Song } from "./Song";
import { Playlist } from "./Playlist";

// Create individual songs
let song1 = new Song("Song 1");
let song2 = new Song("Song 2");
let song3 = new Song("Song 3");
let song4 = new Song("Song 4");

// Create playlists and add songs
let playlist1 = new Playlist();
let playlist2 = new Playlist();

playlist1.addComponent(song1);
playlist1.addComponent(song2);

playlist2.addComponent(song3);
playlist2.addComponent(song4);

// Add playlist to another playlist
playlist1.addComponent(playlist2);

// Play playlist
playlist1.playSong();
