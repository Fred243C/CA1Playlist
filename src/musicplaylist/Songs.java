/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplaylist;

/**
 *
 * @author alexb
 */
public class Songs {
    String title;
    String artist;
    String genre;
    Songs prev;
    Songs next;
    
    
    public Songs(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Songs{" + "title=" + title + ", artist=" + artist + ", genre=" + genre + '}';
    }
    
    
    
}
