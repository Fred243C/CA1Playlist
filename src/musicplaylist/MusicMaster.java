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
           PlaylistNode newGenreSongs= new PlaylistNode();
           genrePlaylist.put(genre, newGenreSongs);
           System.out.println("Genre Playlist:'"+genre+"'successfully created");
       }else {
           System.out.println("genre playlist:'"+genre+"'genre already exists");
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
            System.out.println("Not found");
        }
    }

    // Show number of Songs in a playlist
    public void showNumberOfSongs(String playlistName) {
        int count;
        if (playlistName.equalsIgnoreCase(playlistName)){
            count=likedSongs.size();
            System.out.println("Number of liked songs:"+ count);
            
        }else if(genrePlaylist.containsKey(playlistName)){
            count=genrePlaylist.get(playlistName).size();
            System.out.println("Number of songs:"+playlistName+"playlist name:"+count);
        }else{
            System.out.println("No playlist.");
        }
        
    }
    public void showGenrePlaylist(String genre){
        if(genrePlaylist.containsKey(genre)){
            int count= genrePlaylist.get(genre).size();
            System.out.println("Number of Songs"+genre+"playlist:"+ count);
        }else{
            System.out.println("Genre playlist for'"+genre+"'not found");
        }
    }

// Create a repeatable playlist
     public PlaylistNode createRepeatablePlaylist(){
      return new PlaylistNode(true);
     }
    


}