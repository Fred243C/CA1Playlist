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
    //Create genrePlaylist
    
   public void genrePlaylist(String genre){
       if(!genrePlaylist.containsValue(genre)){
           PlaylistNode Pop= new PlaylistNode();
           genrePlaylist.put(genre, Pop);
           System.out.println("Genre Playlist:'"+Pop+"'successfully created");
       }else if(!genrePlaylist.containsKey(genre)){
           PlaylistNode Rnb = new PlaylistNode();
           genrePlaylist.put(genre, Rnb);
           System.out.println("genre playlist:'"+Rnb+"'genre already exists");
       }
   }

    // Add songs to the liked playlist
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
                PlaylistNode Pop = new PlaylistNode();
                Pop.add(lastSong);
                genrePlaylist.put(genre, Pop);

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
            System.out.println("Not found");
        }
    }

    // Show number of Songs in a playlist
    public void showNumberOfSongs(String genre) {
        if (genrePlaylist.containsValue(genre)){
            int count = genrePlaylist.get(genre).size();
            System.out.println("Number of songs:"+genre+"playlist:"+ count);
            
        }else{
            System.out.println("Number of songs:'"+genre+"'Not found");
        }
        
    }

// Create a repeatable playlist
     public PlaylistNode createRepeatablePlaylist(){
      return new PlaylistNode(true);
     }
    


}