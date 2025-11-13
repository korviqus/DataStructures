package ExamStudy;

public class Node {
    private int data;
    private Node prev;
    private Node next;

    public Node(){
        this.data = 0;
        this.prev = null;
        this.next = null;
    }
    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public int getData(){
        return this.data;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setPrev(Node prev){
        this.prev = prev;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getPrev(){
        return this.prev;
    }
    public Node getNext(){
        return this.next;
    }
}
