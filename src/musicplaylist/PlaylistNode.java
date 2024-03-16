/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplaylist;

/**
 *
 * @author alexb
 */
public class PlaylistNode {

    private Node head;
    private Node tail;
    private boolean repeatable;
    private int size;

    public PlaylistNode() {
        this.head =null;
        this.tail=null;
        this.size=0;
        this.repeatable= false;
    }
    public PlaylistNode(boolean repeatable){
        this.head=null;
        this.tail=null;
        this.size=0;
        this.repeatable= repeatable;
    }
    public void add(Songs songs){
        Node newNode = new Node(songs);
        if(head ==null){
            head= newNode;
            tail=newNode;
        }else{
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail=newNode;
        }
        size++;
    }
    public boolean search(Songs songs){
        Node curr= head;
        
    while(curr !=null){
        if(curr.getSongs().equals(songs)){
            return true;
        }
        curr = curr.getNext();
    }
    return false;
    }
    
    //Remove song
    public void remove(Songs songs){
        Node curr = head;
        while(curr !=null){
            if(curr.getSongs().equals(songs)){
                Node prevNode= curr.getPrev();
                Node nextNode= curr.getNext();
                if(prevNode !=null){
                    prevNode.setNext(nextNode);
                }else{
                    head = nextNode;
                }
                if(nextNode !=null){
                    nextNode.setPrev(prevNode);
                }else{
                    tail = prevNode;
                }
                size--;
                return;
            }
            curr = curr.getNext();
        }
    }
    public void removeLast(){
        if (tail !=null){
            Node prevNode= tail.getPrev();
            if(prevNode !=null){
                prevNode.setNext(null);           
        }else{
                head = null;
            }
            tail = prevNode;
            size--;
        }
    }
    public Node getLastSong(){
        return tail;
    }
    public void print(){
        Node curr = head;
        while(curr !=null){
            System.out.println(curr.getSongs().getTitle()+curr.getSongs().getArtist()+curr.getSongs().getGenre());
            curr = curr.getNext();
        }
    }
    public int size(){
        return size;
    }
}


    

