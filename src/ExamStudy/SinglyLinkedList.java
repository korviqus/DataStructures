package ExamStudy;

public class SinglyLinkedList {
    Node head;
    int size;

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
}
