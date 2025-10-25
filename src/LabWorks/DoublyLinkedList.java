package LabWorks;

public class DoublyLinkedList {
    Song head;
    Song tail;
    Song current;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.current = null;
    }


    public void addSong(String name){
        Song newSong = new Song(name);
        if(this.head == null){
            this.tail = newSong;
            this.head = this.tail;
            this.current = this.tail;
        }else {
            this.tail.next = newSong;
            newSong.previous = this.tail;
            this.tail = newSong;
        }
    }

    public void previous(){
        if(this.current.previous == null){
            throw new IndexOutOfBoundsException("There is no previous song!");
        }else {
            this.current = this.current.previous;
        }
    }

    public void next(){
        if(this.current.next == null){
            throw new IndexOutOfBoundsException("There are no more songs left in the playlist!");
        }else {
            this.current = this.current.next;
        }
    }
}
