package personalworks;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.append("Hydrogen", (2*Math.pow(10,32)));
        list1.append("Helium", (Math.pow(10,32)));
        list1.printList();
        list1.prepend("Argon",(3*Math.pow(10,31)));
        list1.append("Chlorine", (2*Math.pow(10,31)));
        list1.printList();
        LinkedList list2 = list1.deepCopy();
        list2.delete("Hydrogen", (2*Math.pow(10,32)));
        list2.delete("Helium", 5);
        list2.delete("Chlorine", (2*Math.pow(10,31)));
        list2.delete("Argon",(3*Math.pow(10,31)));
        list2.delete("Helium", (Math.pow(10,32)));
        list2.printList();
        list2.delete("EEE",333);
        list1.printList();
    }
}
