package LabWorks.BinarySearchTrees;

public class BinaryTree {

    private Node root;

    // ---------- ADD NODE (ITERATIVE) ----------
    public void addNode(int data) {
        Node newNode = new Node(data);

        // if tree empty, new node is root
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent  = null;

        while (current != null) {
            parent = current;

            if (data < current.data) {
                current = current.left;
            } else if (data > current.data) {
                current = current.right;
            } else {
                // data already exists, do nothing (no duplicates)
                return;
            }
        }

        // attach new node to the correct side of parent
        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    // ---------- SEARCH NODE (ITERATIVE) ----------
    public boolean searchNode(int data) {
        Node current = root;

        while (current != null) {
            if (data == current.data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    // ---------- REMOVE NODE (ITERATIVE) ----------
    public void removeNode(int data) {
        Node current = root;
        Node parent  = null;

        // 1) Find node and its parent
        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        // Not found
        if (current == null) {
            return;
        }

        // Case 1 & 2: node has 0 or 1 child
        if (current.left == null || current.right == null) {
            Node child;
            if (current.left != null) {
                child = current.left;
            } else {
                child = current.right;  // could be null if leaf
            }

            // If deleting the root
            if (parent == null) {
                root = child;
            } else if (parent.left == current) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        } else {
            // Case 3: two children
            // Find inorder successor (smallest in right subtree)
            Node succParent = current;
            Node succ = current.right;

            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }

            // Copy successor's value into current node
            current.data = succ.data;

            // Delete successor node (it has at most one right child)
            Node succChild = succ.right;  // could be null

            if (succParent.left == succ) {
                succParent.left = succChild;
            } else {
                succParent.right = succChild;
            }
        }
    }

    public void printInOrder(){
        printInOrder(root);
        System.out.println();
    }
    private void printInOrder(Node current){
        if (current == null){
            return;
        }
        //go left-subtree recursive
        printInOrder(current.left);
        //print current
        System.out.println(current.data);
        //go right subtree recursive
        printInOrder(current.right);
    }

}
