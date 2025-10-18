package personalworks;

public class LinkedList {
    Node head;
    int size = 0;
    public LinkedList(){
        // The initial list is going to be empty
        this.head = null;
    }
    //Method to append an element to the end of the list
    public void append(String gasName, double collisions){
        Node newNode = new Node(gasName, collisions);
        //Make a head if the list is empty
        if(this.head == null){
            this.head = newNode;
            this.size++;
            return;
        //If a head already exists
        }else{
            //Temporary node
            Node currNode = this.head;
            //Keeps iterating through nodes until we reach the tail
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
            this.size++;
        }
    }
    //Method to add an element to start of the list
    public void prepend(String gasName, double collisions){
        Node newNode = new Node(gasName, collisions);
        //New node points to original head
        newNode.next = this.head;
        //New node is assigned as the new head
        this.head = newNode;
        this.size++;
    }
    //Method to delete the node with given data
    public void delete(String gasName, double collision){
        //Handles the case where the list is empty
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
        Node currNode = this.head;
        while(currNode.next != null) {
            if(currNode.next.gasName.equalsIgnoreCase(gasName) && currNode.next.collisions == collision){
                currNode.next = currNode.next.next;
                size--;
                return;
            }
            currNode = currNode.next;
        }
        System.out.println("Item not in list.");
    }
    //A method to print the elements of the list
    public void printList(){
        if(this.head == null){
            System.out.println("The list is empty!");
            return;
        }
        Node currNode = this.head;
        while(currNode != null){
            System.out.print("------------\n");
            System.out.printf("Name: %s\nCollisions per L/s at 1 atm: %e\n", currNode.gasName, currNode.collisions);
            currNode = currNode.next;
        }
        System.out.println("---End of list---\n");
    }

    public LinkedList deepCopy(){
        LinkedList deepCopy = new LinkedList();
        Node currNode = this.head;
        while(currNode != null){
            deepCopy.append(currNode.gasName, currNode.collisions);
            currNode = currNode.next;
        }
        return deepCopy;
    }
}
