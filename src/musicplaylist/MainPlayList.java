/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicplaylist;

import java.util.ArrayList;

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

        MusicMaster master = new MusicMaster();

        master.addToLikedSongs(new Songs("Sous le vent", "garou", "Pop"));
        master.addToLikedSongs(new Songs("When A woman love", "Rkelly", "Rnb"));
        master.addToLikedSongs(new Songs("Le temps", "Tayc", "Pop"));
        master.addToLikedSongs(new Songs("Sous le vent", "garou", "Pop"));
        master.addToLikedSongs(new Songs("Hold my Hand", "MJ", "Rnb"));
        master.addToLikedSongs(new Songs("People", "Libianca", "Pop"));
        
    //Mode songs to genre playlist
    
        master.moveToGenrePlaylist("Pop");
        master.moveToGenrePlaylist("Rnb");
        
        //Show number of songs for each playlist

       
        
        
        System.out.println("Number of songs for liked playlist");
         master.showNumberOfSongs("liked");
        
        System.out.println("Number of songs for Pop playlist");
        master.showNumberOfSongs("Pop");
        
        System.out.println("Number of songs for Rnb playlist");
        master.showNumberOfSongs("Rnb");
        //Print each playlist

        
       
        
        
        System.out.println("Liked Playlist");
        master.printPlaylist("liked");
        
        System.out.println("Pop Playlist");
         master.printPlaylist("Pop");
         
        System.out.println("Rnb Playlist");
        master.printPlaylist("Rnb");

    }
}
