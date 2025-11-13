package ExamStudy;

public class Stack {
    Node top;
    int size;
    public Stack(){
        this.top = null;
        size = 0;
    }

    public boolean isEmpty(Stack stack){
        return stack.top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            size++;
            return;
        }
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public int pop() {
        if(top == null){
            return -1;
        }
        System.out.println("Top value: "+top.getData());
        int value = top.getData();
        top = top.getNext();
        size--;
        return value;
    }

    public int getSize() {
        return size;
    }
}
