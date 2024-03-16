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
        Node lastSongNode= likedSongs.getLastSong();
        if(lastSongNode !=null){
            Songs lastSong = lastSongNode.getSongs();
            if(genrePlaylist.containsKey(genre)){
                genrePlaylist.get(genre).add(lastSong);
            }else{
                PlaylistNode newGenrePlaylist= new PlaylistNode();
                newGenrePlaylist.add(lastSong);
                genrePlaylist.put(genre, newGenrePlaylist);
                
            }
            likedSongs.removeLast();
        }else{
            System.out.println("List empty.");
        }
        
    }
    //Print Playlist
    public void printPlaylist(String name){
        if(name.equalsIgnoreCase("liked")){
            likedSongs.print();
        }else if(genrePlaylist.containsKey(name)){
            genrePlaylist.get(name).print();
            
        }else{
            System.out.println("Not found");
        }
    }
    // Show number of Songs in a playlist
    public void showNumberOfSongs(String name){
        int count;
        if(name.equalsIgnoreCase("liked"));
        count = likedSongs.size();
        System.out.println("liked Playlist:"+count);
    }
    
    
    
    }
    
    
    

