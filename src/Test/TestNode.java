package Test;

public class TestNode {
    TestNode prev;
    TestNode next;
    int data;

    public TestNode(){
        this.next = null;
        this.prev = null;
        this.data = 0;
    }
}
