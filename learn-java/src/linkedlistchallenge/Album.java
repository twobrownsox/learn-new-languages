package linkedlistchallenge;

import java.util.ArrayList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Song> getSongs(){
        return this.songs;
    }

    public String toString() {
        return this.name + " by " + this.artist;
    }
}
