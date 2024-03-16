/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplaylist;

/**
 *
 * @author alexb
 */
public class Playlist {

    String name;
    Songs head;
    Songs tail;
    int size;

    public Playlist(String name) {
        this.name = name;
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //add method
    public void addSongs(String title, String artist, String genre) {

        Songs newSongs = new Songs(title, artist, genre);
        if (head == null) {
            head = newSongs;
            tail = newSongs;
        } else {
            newSongs.prev = tail;
            tail.next = newSongs;
            tail = newSongs;
        }
        size++;
    }

    //Remove method
    public void removeSongs(Songs songs) {
        Songs currSongs = head;

        while (currSongs != null) {
            if(currSongs ==null){
                currSongs.prev.next = currSongs.next;
                
            }else{
                head = currSongs.next;
            }
            if(currSongs.next !=null){
                currSongs.next.prev = currSongs.prev;
                
            }else{
                tail = currSongs.prev;
            }
            
            size--;
            return;

        }
        if (currSongs == null) {
            System.out.println("Playlist Empty");
        } else {
            head = null;

        }

    }

    public void moveToGenrePlaylist(Songs songs, Playlist genrePlaylist) {
        genrePlaylist.addSongs(songs.getTitle(),songs.getArtist(),songs.getGenre());
        removeSongs(songs);

    }

    public void printPlaylist() {
        System.out.println("Playlist:" + name);
        Songs currSongs = head;
        while (currSongs != null) {
            System.out.println(currSongs.getTitle() + currSongs.getArtist() + currSongs.getGenre());
            currSongs = currSongs.next;

        }
        System.out.println("Full Playlist:" + size);
    }
}

    class PlaylistManager {

        Playlist likedSongs;
        Playlist genrePop;
        Playlist genreRnb;

        public PlaylistManager() {

            likedSongs = new Playlist("Liked Songs");
            genrePop = new Playlist("Genre Pop");
            genreRnb = new Playlist("genre Rnb");
        }

        public void addToLikedSongs(String title, String artist, String genre) {
            likedSongs.addSongs(title, artist, genre);
        }

        public Playlist addGenrePlaylist(String name) {
            return new Playlist(name);

        }

        public void printPlaylist(Playlist playlist) {
            playlist.printPlaylist();
        }
    }

