package Test;

import com.jogamp.nativewindow.CapabilitiesFilter;

public class TestList {
    TestNode head;
    TestNode tail;
    int size;

    public TestList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void append(int data) {
        TestNode newNode = new TestNode();
        newNode.data = data;
        if (this.head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    public void prepend(int data) {
        TestNode newNode = new TestNode();
        newNode.data = data;
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void remove(int data) {
        TestNode pointer = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }
        while (pointer.next != null) {
            if (pointer.next.data == data) {
                pointer.next = pointer.next.next;
                size--;
                return;
            }
            pointer = pointer.next;
        }
        System.out.println("Not found.");
    }

    public void printReverse() {

    }

    public void reverse() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            return;
        }else{
            TestNode prev = null;
            TestNode next = null;
            TestNode pointer = head;
            while(pointer != null){
                next = pointer.next;
                pointer.next = prev;
                pointer.prev = next;
                prev = pointer;
                pointer = next;
            }tail = head;
            head = prev;
        }
    }
}
