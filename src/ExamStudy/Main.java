package ExamStudy;

public class Main {
    public static void main(String[] args){

        //SinglyLinkedList Test Cases
        SinglyLinkedList myList = new SinglyLinkedList();
        SinglyLinkedList theOtherList = new SinglyLinkedList();
        myList.append(15);
        myList.append(16);
        myList.append(17);

        myList.prepend(20);

        myList.printList();

        theOtherList.append(20);
        theOtherList.append(15);
        theOtherList.append(16);
        theOtherList.append(17);

        System.out.println(SinglyLinkedList.areIdentical(myList, theOtherList));
        System.out.println(myList.search(16));

        myList.delete(15);
        myList.printList();

        System.out.println(SinglyLinkedList.areIdentical(myList, theOtherList));

        myList.delete(16);
        myList.delete(18);

        System.out.println(myList.getSize());

        myList.delete(17);
        myList.delete(20);
        myList.delete(16);

        System.out.println(myList.search(16));

        SinglyLinkedList.reverseList(theOtherList);
        theOtherList.printList();
        System.out.println("---------------------");

        CircularLinkedList circularWoo = new CircularLinkedList();
        circularWoo.append(1);
        circularWoo.append(2);
        circularWoo.append(3);
    }
}
