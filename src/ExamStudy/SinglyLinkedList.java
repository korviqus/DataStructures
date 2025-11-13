package ExamStudy;

public class SinglyLinkedList {
    protected Node head;
    protected int size;

    public static boolean areIdentical(SinglyLinkedList list1, SinglyLinkedList list2){
        Node iterator1 = list1.head;
        Node iterator2 = list2.head;
        while(iterator1 != null && iterator2 != null){
            if(iterator1.getData() != iterator2.getData()){
                return false;
            }
            iterator1 = iterator1.getNext();
            iterator2 = iterator2.getNext();
        }return true;
    }

    public static void printReverse(Node head) {
        if (head == null) {
            return;
        } else {
            printReverse(head.getNext());
        }
        System.out.println(head.getData() + " ");
    }

    public static void reverseList(SinglyLinkedList list){
        Node pointer = list.head;
        Node prev = null;
        Node next = null;
        while(pointer != null){
            next = pointer.getNext();
            pointer.setNext(prev);
            prev = pointer;
            pointer = next;
        }
        list.head = prev;
    }

    public SinglyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void append(int data){
        Node tempNode = new Node(data);
        if(this.head == null){
            this.head = tempNode;
            this.size++;
            return;
        }else{
            Node currNode = this.head;
            while(currNode.getNext() != null){
                currNode = currNode.getNext();
            }
            currNode.setNext(tempNode);
            this.size++;
        }
    }

    public void prepend(int data){
        Node tempNode = new Node(data);
        tempNode.setNext(this.head);
        this.head = tempNode;
        this.size++;
    }

    public void delete(int data){
        if(this.head == null){
            System.out.println("The list is empty.");
            return;
        }
        if(this.head.getData() == data){
            this.head = this.head.getNext();
            this.size--;
            return;
        }
        Node currNode = head;
        while(currNode.getNext() != null){
            if(currNode.getNext().getData() == data){
                currNode.setNext(currNode.getNext().getNext());
                this.size--;
                return;
            }
            currNode = currNode.getNext();
        }
        System.out.println("Item not found.");
    }

    public void printList(){
        if(this.head == null){
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Size:"+this.size);
        Node currNode = head;
        while(currNode != null){
            System.out.println("Data: "+currNode.getData());
            currNode = currNode.getNext();
        }
    }

    public boolean isEmpty(){
        return (this.head == null);
    }

    public boolean search(int data){
        if(head == null){
            return false; //or throw exception
        }else {
            Node currNode = this.head;
            while(currNode != null){
                if(currNode.getData() == data){
                    return true;
                }else{
                    currNode = currNode.getNext();
                }
            }return false;
        }
    }

    public int getSize(){
        return this.size;
    }
}
