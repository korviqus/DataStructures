package ExamStudy;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.append(15);
        myList.append(16);
        myList.append(17);
        myList.prepend(20);
        myList.printList();
        myList.delete(15);
        myList.printList();

    }
}
