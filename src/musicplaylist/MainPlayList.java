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
        
        MusicMaster musicMaster = new MusicMaster();
        
        //Add songs to the liked list
        
        Songs song1= new Songs("Sous le vent","garou","Pop");
        Songs song2= new Songs("When A woman love","Rkelly","Rnb");
        Songs song3= new Songs("Le temps","Tayc","Pop");
        Songs song4= new Songs("Sous le vent","garou","Pop");
        Songs song5= new Songs("Hold my Hand","MJ","Rnb");
        Songs song6= new Songs("People","Libianca","Pop");
        
        musicMaster.addToLikedSongs(song1);
        musicMaster.addToLikedSongs(song2);
        musicMaster.addToLikedSongs(song3);
        musicMaster.addToLikedSongs(song4);
        musicMaster.addToLikedSongs(song5);
        musicMaster.addToLikedSongs(song6);
        
        System.out.println("Liked Songs:");
        musicMaster.printPlaylist("liked");
        System.out.println();
       
    }
}
