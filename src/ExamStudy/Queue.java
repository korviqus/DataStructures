package ExamStudy;

public class Queue {
    Node front;
    Node rear;
    int size;
    public Queue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEMpty(){
        return (size == 0);
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(this.front == null){
            this.front = newNode;
            this.rear = newNode;
            size++;
        }else{
            this.rear.setNext(newNode);
            this.rear = newNode;
            size++;
        }
    }

    public void dequeue(){
        if(front == null){
            System.out.println("The queue is empty.");
            return;
        }else{
            front = front.getNext();
            if(front == null){
                rear = null;
                size--;
            }
        }
    }

    public int peek(){
        if(this.front == null){
            return -1;
        }else{
            return front.getData();
        }
    }

    public int rear(){
        if(this.rear == null){
            return -1;
        }else{
            return rear.getData();
        }
    }

}
