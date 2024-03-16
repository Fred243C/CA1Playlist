/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplaylist;

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
     
    // Add songs to the liked playlist
    
    public void addToLikedSongs(Songs songs){
        likedSongs.add(songs);
    }
    //Move last added song from liked liked playlist to genre playlist
    public void moveToGenrePlaylist(String genre){
        PlaylistNode tail = likedSongs.
    }
    }
    
    
    

