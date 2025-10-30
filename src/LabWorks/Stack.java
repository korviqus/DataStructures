package LabWorks;

public class Stack {
    Node head;
    Node middle;
    Node tail;
    int size;

    public Stack(){
        this.head = null;
        this.middle = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            head = tail = middle = newNode;
            size++;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
            if(size%2 ==1){
                middle = middle.prev;
            }


        }
    }

}
