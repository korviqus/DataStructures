package LabWorks;

public class BinarySearchTree {
    BinNode root;

    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int data){
        BinNode newNode = new BinNode(data);
        if(root == null){
            root = newNode;
            return;
        }
        BinNode pointer = root;
        if(pointer.data > newNode.data){
            while(root != null){
                pointer = pointer.left;
            }pointer = newNode;
            return;
        }else{
            while(pointer != null){
                pointer = pointer.right;
            }pointer = newNode;
        }return;
    }

    public BinNode delete(int data, BinNode node){
        if(node.left == null && node.right == null){
            if(node.data == data){
                node = null;
            }
        }
        else if(node.left == null ^ node.right == null){
            if(node.left != null){
                if(node.left.data == data){
                    node.left = null;
                }
            }else{
                if(node.right.data == data){
                    node.right = null;
                }
            }
        }else{

        }
        return this.root;
    }
}
