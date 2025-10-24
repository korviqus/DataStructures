package LabWorks;

public class Song {
    String name;
    Song next;
    Song previous;

    //Constructor
    public Song(String name) {
        this.name = name;
        this.next = null;
        this.previous = null;
    }
}
