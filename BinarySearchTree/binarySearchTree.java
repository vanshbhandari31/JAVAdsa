package BinaryTree;

public class binarySearchTree {


    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class BST{
        public static Node insert(Node root , int val) {
            if (root == null) {
                root = new Node(val);
                return root;
            }
            if(root.data>val){
                //insert into the left subTree
                root.left=insert(root.left,val);
            }
            else{
                //insert into the right subTree
                root.right=insert(root.right,val);
            }
            return root;
        }
    }

    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i = 0; i <values.length ; i++) {
            root=BST.insert(root,values[i]);
        }

        inorder(root);

    }
}
