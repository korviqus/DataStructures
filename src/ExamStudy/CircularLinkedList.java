package ExamStudy;

public class CircularLinkedList extends SinglyLinkedList {
    protected Node tail;

    //public static void printReverse(Node head) {
        //write this later
    //}

    //public static void reverseList(SinglyLinkedList list){
        //write this later
    //}

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void append(int data){
        Node tempNode = new Node(data);
        if(this.head == null){
            this.head = tempNode;
            this.tail = tempNode;
            this.tail.setNext(this.head);
            this.size++;
            return;
        }else{
            this.tail.setNext(tempNode);
            this.tail = tempNode;
            this.tail.setNext(head);
        }size++;
    }

    public void prepend(int data){
        Node tempNode = new Node(data);
        tempNode.setNext(head);
        head = tempNode;
        this.tail.setNext(head);
        size++;
    }
    //modify
    public void delete(int data){
        if(this.head == null){
            System.out.println("The list is empty.");
            return;
        }
        if(this.head.getNext() == this.head){
            this.head = null;
            this.tail = null;
            size--;
            return;
        }
        if(this.head.getData() == data){
            this.head = this.head.getNext();
            this.tail.setNext(head);
            this.size--;
            return;
        }
        Node currNode = head;
        while(currNode.getNext() != head){
            if(currNode.getNext().getData() == data){
                if(currNode.getNext() == tail){
                    currNode.setNext(currNode.getNext().getNext());
                    tail = currNode;
                }else {
                    currNode.setNext(currNode.getNext().getNext());
                }
                this.size--;
                return;
                }
            currNode = currNode.getNext();
            }
        System.out.println("Item not found.");
        }

    }

    //public void printList(){
        //write this later

    //}

    //public boolean isEmpty(){
    //    return (this.head == null);
    //}
    //
    //public boolean search(int data){
    //write this later
    //}


