package linkedlistchallenge;

import java.util.*;

public class Main {

    private static ArrayList<Album> albumList = new ArrayList<Album>();
    private static LinkedList<Song> playList = new LinkedList<Song>();
    private static ListIterator playListListIterator;
    private static boolean goingForwards = true;

    public static void main(String[] args) {

        printOptions();
        boolean quit = false;
        while (!quit) {

            int option = getIntInput("\nEnter an option: ");
            switch (option) {
                case 1:
                    addAlbum();
                    break;
                case 2:
                    addSongToAlbum();
                    break;
                case 3:
                    addToPlaylist();
                    playListListIterator = playList.listIterator(); // only initialise the list iterator after it has been populated to prevent ConcurrentModificationException
                    break;
                case 4:
                    removeFromPlaylist();
                    playListListIterator = playList.listIterator(); // only initialise the list iterator after it has been populated to prevent ConcurrentModificationException
                    break;
                case 5:
                    removeCurrentFromPlaylist();
                    break;
                case 6:
                    showPlayList();
                    break;
                case 7:
                    playNextSong();
                    break;
                case 8:
                    playPreviousSong();
                    break;
                case 9:
                    replayCurrentSong();
                    break;
                case 10:
                    printOptions();
                    break;
                case 11:
                    quit = true;
                    break;
                default:
                    printOptions();
                    break;
            }

        }
    }

    private static void printOptions() {
        System.out.println(
                "\n\t1  - Add an Album\n" +
                  "\t2  - Add a Song to an Album\n" +
                  "\t3  - Add a Song to the Playlist\n" +
                  "\t4  - Remove a Song from the Playlist\n" +
                  "\t5  - Remove current song from playlist\n" +
                  "\t6  - Show the Playlist\n" +
                  "\t7  - Play Next song on Playlist\n" +
                  "\t8  - Play Previous Song on the Playlist\n" +
                  "\t9  - Replay current song on the Playlist\n" +
                  "\t10  - Print options\n" +
                  "\t11 - Quit");
    }

    private static void addAlbum() {
        String name = getStringInput("\nEnter Album Title: ");
        if (name.equals("")) {
            System.out.println("Album title not entered. album not added");
        } else {
            String artist = getStringInput("Enter Artist Name: ");
            Album album = new Album(name,artist);
            albumList.add(album);
            System.out.println("New album added: " + album.toString());
        }
    }

    private static void addSongToAlbum() {

        if (albumList.size() > 0) {

            System.out.println("\nSelect an album:");
            int i = 0;
            for (Album album: albumList) {
                System.out.println(i++ + " - " + album.toString());
            }

            int option = getIntInput("Enter album number: ");
            if (option <= albumList.size()) {
                Album album = albumList.get(option);
                String title = getStringInput("Enter Song Title: ");
                double duration = getDoubleInput("Enter Song Duration: ");
                boolean created = album.addSong(title,duration);
                if (created) {
                    System.out.println(Song.toString(title, duration) + " added to album " + album.toString());
                } else {
                    System.out.println("Song " + title + " already exists on album " + album.toString());
                }
            } else {
                System.out.println("Invalid option. No album found");
            }

        } else {
            System.out.println("No albums exist. Please add an album");
        }

    }

    private static void addToPlaylist() {

        int i = 0;
        for (Album album: albumList) {
            System.out.println(i++ + " - " + album.toString());
            int j = 0;
            for (Song song: album.getSongs()) { // for each loop
                System.out.println("\t" + j++ + " - " + song.toString());
            }
        }

        int albumNumber = getIntInput("\nEnter Album number: ");

        if (albumNumber <= albumList.size()) {
            int songNumber = getIntInput("Enter Song number: ");
            Album album = albumList.get(albumNumber);
            if (songNumber <= album.getSongs().size()) {
                Song song = album.getSongs().get(songNumber);
                playList.add(song);
                System.out.println("Song " + song.toString() + " added to Playlist");
            } else {
                System.out.println("Invalid option. Song not found on album " + album.toString());
            }
        } else {
            System.out.println("Invalid option. No album found");
        }

    }

    private static void removeFromPlaylist() {

        showPlayList();
        int option = getIntInput("\nEnter song number to remove: ");
        if (option <= playList.size()) {
            Song song = playList.get(option);
            playList.remove(song);
            System.out.println("Song " + song.toString() + " removed from Playlist");
        } else {
            System.out.println("Invalid option. Song not found in Playlist");
        }

    }

    private static void removeCurrentFromPlaylist() {
        if (playList.size() > 0) {
            playListListIterator.remove();
            if (playListListIterator.hasNext()) {
                System.out.println("Now playing " + playListListIterator.next());
            } else if (playListListIterator.hasPrevious()) {
                System.out.println("Now playing " + playListListIterator.previous());
            }
        }
    }

    private static void showPlayList() {
        System.out.println("\nSongs in Playlist:");
        Iterator playListIterator = playList.iterator(); // iterator can be used as do not need to go backwards and forwards
        int i = 0;
        while (playListIterator.hasNext()) {
            System.out.println("\t" + i++ + " - " + playListIterator.next().toString());
        }
    }

    private static void playNextSong() {
        if (!goingForwards) {
            if (playListListIterator.hasNext()) {
                playListListIterator.next();
            }
            goingForwards = true;
        }
        if (playListListIterator.hasNext()) {
            System.out.println("\nNow playing song " + playListListIterator.next().toString());
        } else {
            System.out.println("\nReached last song in playlist");
            goingForwards = false;
        }
    }

    private static void playPreviousSong() {
        if (goingForwards) {
            if (playListListIterator.hasPrevious()) {
                playListListIterator.previous();
            }
            goingForwards = false;
        }
        if (playListListIterator.hasPrevious()) {
            System.out.println("\nNow playing song " + playListListIterator.previous().toString());
        } else {
            System.out.println("\nReached first song in playlist");
            goingForwards = true;
        }
    }

    private static void replayCurrentSong() {
        if (goingForwards) {
            System.out.println("\nReplaying song " + playListListIterator.previous().toString());
            goingForwards = false;
        } else {
            System.out.println("\nReplaying song " + playListListIterator.next().toString());
            goingForwards = true;
        }
    }

    private static String getStringInput(String message) {
        Scanner s = new Scanner(System.in);
        System.out.println(message);
        return s.nextLine();
    }

    private static int getIntInput(String message) {
        String stringValue = getStringInput(message);
        return Integer.parseInt(stringValue);
    }

    private static double getDoubleInput(String message) {
        String stringValue = getStringInput(message);
        return Double.parseDouble(stringValue);
    }

}
