package LabWorks.hashtabletest;

public class IntHashTable {

    // Node for the linked list in each table field (separate chaining).
    private static class Node {
        int studentId;
        String studentName;
        double studentGrade;
        Node next;

        // Constructor: by default, next is null.
        Node(int id, String name, double grade) {
            this.studentId = id;
            this.studentName = name;
            this.studentGrade = grade;
        }
    }

    private Node[] table;


    public IntHashTable(int tableSize) {
        table = new Node[tableSize];
    }


    //Very simple hash function here
    private int hash(int id) {
        id = Math.abs(id);
        return id % table.length;
    }


    public void set(int id, String name, double grade) {
        int index = hash(id);
        for(int i = 0; i < table.length; i++){
            Node current = table[i];
            if(current.studentId == index){
                current.studentName = name;
                current.studentGrade = grade;
            }
        }
    }


    public String get(int id) {






    }

    /*
     Utility method: print the full content of the hash table.
     This is useful to show how separate chaining works.
     */
    public void printTable() {
        System.out.println("=== Hash Table Nodes ===");
        for (int i = 0; i < table.length; i++) {
            System.out.print("Table Node " + i + ": ");

            Node current = table[i];
            if (current == null) {
                System.out.println("empty");
            } else {
                while (current != null) {
                    System.out.print("[ID=" + current.id +
                            ", Name=" + current.name +
                            ", Grade=" + current.grade + "] -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
        System.out.println("==========================");
    }

    /*
     Exercise :
     Compute the average grade of all students stored in the hash table.
    */
    public double getAverageGrade() {







    }

}
