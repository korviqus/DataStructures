package personalworks;

public class Node {
    //Holds some form of data that is let's say number of collisions per second in a 1L of a real gas
    String gasName;
    double collisions;
    Node next;

    //Constructor
    public Node(String name, double collision){
        this.gasName = name;
        this.collisions = collision;
        this.next = null;
    }
}
