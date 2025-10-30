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

    public int pop(){
       //pop returns the popped value
       //check if head is null after popping
       //check if middle.next is null before moving
        if(head != null){
            head = head.next;
            head.prev = null;
            size--;
            if(size % 2 == 0){
                middle = middle.next;
            }
        }
    }

    public void deleteMiddle(){
        middle.next.prev = middle.prev;
        middle.prev.next = middle.next;
        size--;
        if(size % 2 == 0){
            middle = middle.next;
        }else{
            middle = middle.prev;
        }
    }
}
