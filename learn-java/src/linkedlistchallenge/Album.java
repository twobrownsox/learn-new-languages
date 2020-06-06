package linkedlistchallenge;

import java.util.ArrayList;

public class Album {

    private String title;
    private ArrayList<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
