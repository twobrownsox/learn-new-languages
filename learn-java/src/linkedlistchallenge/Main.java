package linkedlistchallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albumList = new ArrayList<Album>();
    private static LinkedList<Song> playList = new LinkedList<Song>();
    private static ListIterator playListListIterator;
    private static boolean goingForwards = true;

    public static void main(String[] args) {

        printOptions();
        boolean quit = false;
        while (!quit) {

            System.out.print("\nEnter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

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
                    showPlayList();
                    break;
                case 6:
                    playNextSong();
                    break;
                case 7:
                    playPreviousSong();
                    break;
                case 8:
                    replayCurrentSong();
                    break;
                case 9:
                    printOptions();
                    break;
                case 10:
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
                  "\t5  - Show the Playlist\n" +
                  "\t6  - Play Next song on Playlist\n" +
                  "\t7  - Play Previous Song on the Playlist\n" +
                  "\t8  - Replay current song on the Playlist\n" +
                  "\t9  - Print options\n" +
                  "\t10 - Quit");
    }

    private static void addAlbum() {
        System.out.print("\nEnter Album Title: ");
        String name = scanner.nextLine();
        if (name.equals("")) {
            System.out.println("Album title not entered. album not added");
        } else {
            System.out.print("Enter Artist Name: ");
            String artist = scanner.nextLine();
            Album album = new Album(name,artist);
            albumList.add(album);
            System.out.println("New album added: " + album.toString());
        }
    }

    private static void addSongToAlbum() {

        if (albumList.size() > 0) {

            System.out.println("\nSelect an album:");
//            for (int i = 0; i < albumList.size(); i++) {
//                System.out.println(i + " - " + albumList.get(i).toString());
//            }
            int i = 0;
            for (Album album: albumList) {
                System.out.println(i++ + " - " + album.toString());
            }

            System.out.print("Enter album number: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option <= albumList.size()) {
                Album album = albumList.get(option);

                System.out.print("Enter Song Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Song Duration: ");
                double duration = scanner.nextDouble();
                scanner.nextLine();
                album.addSong(new Song(title, duration));

                System.out.println(Song.toString(title,duration) + " added to album " + album.toString());
            } else {
                System.out.println("Invalid option. No album found");
            }

        } else {
            System.out.println("No albums exist. Please add an album");
        }

    }

    private static void addToPlaylist() {

//        for (int i=0; i<albumList.size(); i++) {
//            System.out.println(i + " - " + albumList.get(i).toString());
//            Album album = albumList.get(i);
//            for (int j=0; j<album.getSongs().size(); j++) {
//                Song song = album.getSongs().get(j);
//                System.out.println("\t" + j + " - " + song.toString());
//            }
//        }
        int i = 0;
        for (Album album: albumList) {
            System.out.println(i++ + " - " + album.toString());
            int j = 0;
            for (Song song: album.getSongs()) {
                System.out.println("\t" + j++ + " - " + song.toString());
            }
        }

        System.out.print("\nEnter Album number: ");
        int albumNumber = scanner.nextInt();
        scanner.nextLine();

        if (albumNumber <= albumList.size()) {
            System.out.print("Enter Song number: ");
            int songNumber = scanner.nextInt();
            scanner.nextLine();
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
        System.out.print("\nEnter song number to remove: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option <= playList.size()) {
            Song song = playList.get(option);
            playList.remove(song);
            System.out.println("Song " + song.toString() + " removed from Playlist");
        } else {
            System.out.println("Invalid option. Song not found in Playlist");
        }

    }

    private static void showPlayList() {
        System.out.println("\nSongs in Playlist:");
        ListIterator playListIterator = playList.listIterator();
        int i = 0;
        while (playListIterator.hasNext()) {
            System.out.println("\t" + i++ + " - " + playListIterator.next());
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
            System.out.println("\nNow playing song " + playListListIterator.next());
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
            System.out.println("\nNow playing song " + playListListIterator.previous());
        } else {
            System.out.println("\nReached first song in playlist");
            goingForwards = true;
        }
    }

    private static void replayCurrentSong() {
        if (goingForwards) {
            System.out.println("\nReplaying song " + playListListIterator.previous());
            goingForwards = false;
        } else {
            System.out.println("\nReplaying song " + playListListIterator.next());
            goingForwards = true;
        }
    }

}
