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
    private Songs head;
    private Songs tail;
    private int size;

    public Playlist(String name) {
        this.name= name;
        this.head= null;
        this.tail= null;
        this.size=0;
    }
    
    //add method
    
    public void addSongs(String title, String artist, String genre){
        
        Songs newSongs = new Songs(title, artist, genre);
        if(head == null){
            head = newSongs;
            tail = newSongs;
        }else{
            newSongs.prev = tail;
            tail.next = newSongs;
            tail = newSongs;            
        }
        size++;
    }
    
    //Remove method
    public void removeSongs(Songs songs){
        Songs currSongs = head;
        
        while(currSongs != null){
            currSongs = currSongs.next;
            size++;
                
            }
           if(currSongs == null){
               System.out.println("Playlist Empty");
        } else{
               head = null;
         
           }
        
        
        
            
        }
        
        
    }
    

