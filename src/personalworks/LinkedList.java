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
        if(this.head == null){
            this.head = newNode;
            this.size++;
            return;
        //If a head already exists
        }else{
            //Temporary node
            Node current = this.head;
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
        newNode.next = this.head;
        //New node is assigned as the new head
        this.head = newNode;
        this.size++;
    }
    //Method to delete the node with given data
    public void delete(String gasName, int collision){
        //Handle the case where the list is empty
        if(this.head == null){
            System.out.println("The list is empty!");
            return;
        }
        //If head is the node to be deleted
        //This is checked seperately because the deletion for middle and tail nodes check for compliance of next node
        //This covers the case where the head is the only node
        if(this.head.gasName.equalsIgnoreCase(gasName) && this.head.collisions == collision){
            this.head = this.head.next;
            this.size--;
            return;
        }
        Node current = this.head;
        while(current.next != null) {
            if(current.next.gasName.equalsIgnoreCase(gasName) && current.next.collisions == collision){
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }
    //A method to print the elements of the list
    public void printList(){
        Node current = this.head;
        while(current != null){
            System.out.printf("Name: %s\nCollisions: %d\n", current.gasName, current.collisions);
            System.out.print("------------\n");
            current = current.next;
        }
    }
}
