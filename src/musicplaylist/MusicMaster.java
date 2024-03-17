/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplaylist;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author alexb
 */
public class MusicMaster {

    private PlaylistNode likedSongs;
    private HashMap<String, PlaylistNode> genrePlaylist;

    public MusicMaster() {
        likedSongs = new PlaylistNode();
        genrePlaylist = new HashMap<>();
    }
    //Create genrePlaylist

    public void addToGenrePlaylist(String genre, Songs songs) {

        if (!genrePlaylist.containsValue(genre)) {

            genrePlaylist.get(genre).add(songs);

        } else {
            System.out.println("genre playlist:'" + genre + "'genre not exists");
        }
    }

    // Add songs to the liked playlist using ArrayList
    public void addToLikedSongs(Songs songs) {
        likedSongs.add(songs);
    }

    //Move last added song from liked liked playlist to genre playlist
    public void moveToGenrePlaylist(String genre) {
        Node lastSongNode = likedSongs.getLastSong();
        if (lastSongNode != null) {
            Songs lastSong = lastSongNode.getSongs();
            if (genrePlaylist.containsKey(genre)) {
                genrePlaylist.get(genre).add(lastSong);
            } else {
                PlaylistNode newGenreSongs = new PlaylistNode();
                newGenreSongs.add(lastSong);
                genrePlaylist.put(genre, newGenreSongs);

            }
            likedSongs.removeLast();
        } else {
            System.out.println("List empty.");
        }

    }

    //Print Playlist
    public void printPlaylist(String playlistName) {
        if (playlistName.equalsIgnoreCase("liked")) {
            likedSongs.print();
        } else if (genrePlaylist.containsKey(playlistName)) {
            genrePlaylist.get(playlistName).print();
        } else {
            System.out.println("Playlist not found");
        }
    }

    // Show number of Songs in a playlist
    public void showNumberOfSongs(String playlistName) {
        int count;
        if (playlistName.equalsIgnoreCase("liked")) {
            count = likedSongs.size();
            System.out.println("Number of liked songs:" + count);

        } else if (genrePlaylist.containsKey(playlistName)) {
            count = genrePlaylist.get(playlistName).size();
            System.out.println("Number of songs:" + playlistName + "playlist name:" + count);
        } else {
            System.out.println("No playlist.");
        }

    }

// Create a repeatable playlist
    public void repeatablePlaylist(String name) {
        PlaylistNode repeatablePlaylist = new PlaylistNode(true);
        genrePlaylist.put(name, repeatablePlaylist);
    }

}
