package personalworks;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.append("Hydrogen", (int)(2*Math.pow(10,32)));
        list1.append("Helium", (int)(Math.pow(10,32)));
        list1.printList();
        list1.prepend("Argon",(int)(3*Math.pow(10,31)) );
        list1.append("Chlorine", (int)(2*Math.pow(10,31)));
        list1.printList();
    }
}
