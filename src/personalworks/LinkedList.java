package personalworks;

public class LinkedList {
    Node head;
    int size = 0;
    public LinkedList(){
        // The initial list is going to be empty
        this.head = null;
    }
    //Method to append an element to the end of the list
    public void append(String gasName, int collisions){
        Node newNode = new Node(gasName, collisions);
        //Make a head if the list is empty
        if(head == null){
            head = newNode;
            this.size = 1;
            return;
        //If a head already exists
        }else{
            //Temporary node
            Node current = head;
            //Keeps iterating through nodes until we reach the tail
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            this.size++;
        }
    }
    //Method to add an element to start of the list
    public void prepend(String gasName, int collisions){
        Node newNode = new Node(gasName, collisions);
        //New node points to original head
        newNode.next = head;
        //New node is assigned as the new head
        head = newNode;
    }
    //Method to delete the node with given data
    public void delete(String gasName, int collision){
        if(head.gasName.equalsIgnoreCase(gasName) && head.collisions == collision){
            head = head.next;
        }
        Node current = head;
        while(!(current.next.gasName.equalsIgnoreCase(gasName) && current.next.collisions == collision)){
            current = current.next;
        }
        current.next = current.next.next;
    }
}
