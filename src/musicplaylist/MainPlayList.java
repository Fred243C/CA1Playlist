/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicplaylist;

/**
 *
 * @author alexb
 */
public class MainPlayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     PlaylistManager playlistManager = new PlaylistManager();
     
     //Adding songs to the liked list
     
     playlistManager.addToLikedSongs("Song1","Beetles","Pop");
     playlistManager.addToLikedSongs("Song2","Rkelly","Rnb");
     playlistManager.addToLikedSongs("Song3","Celine","Rnb");
     playlistManager.addToLikedSongs("Song4","Garou","Rnb");
     playlistManager.addToLikedSongs("Song5","MJ","Pop");
     playlistManager.addToLikedSongs("Song6","Tyres","Rnb");
     playlistManager.addToLikedSongs("Song7","Akon","Pop");
     playlistManager.addToLikedSongs("Song8","Rkelly","Pop");
     playlistManager.addToLikedSongs("Song9","MJ","Pop");
     playlistManager.addToLikedSongs("Song10","Celine","Rnb");
       
   // Create  genre Playlists
   
   Playlist genrePop = playlistManager.addGenrePlaylist("genrePop");
   Playlist genreRnb = playlistManager.addGenrePlaylist("genreRnb");
   
   // add songs from likedSongs to a genre Playlist
   
   playlistManager.likedSongs.moveToGenrePlaylist(playlistManager.likedSongs.tail, genreRnb);
   playlistManager.likedSongs.moveToGenrePlaylist(playlistManager.likedSongs.tail, genrePop);
   
   
        // Print Playlists
        
        playlistManager.printPlaylist(playlistManager.likedSongs);
        playlistManager.printPlaylist(playlistManager.genrePop);
        playlistManager.printPlaylist(playlistManager.genreRnb);
        
       
    
    }
}