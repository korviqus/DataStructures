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

    //Optimise this and remove temporary node
    public void addSong(String name){
        Song newSong = new Song(name);
        if(this.head == null){
            this.tail = newSong;
            this.head = this.tail;
            this.current = this.tail;
        }else {
            Song temp = this.tail;
            this.tail = newSong;
            temp.next = tail;
            this.tail.previous = temp;
        }
    }

    public void previous(){

    }

    public void next(){

    }
}
