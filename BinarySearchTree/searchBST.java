package BinaryTree;

public class searchBST {
    public static Boolean search(binarySearchTree.Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        }
        if (root.data == key) {
            return true;
        } else if (root.data < key) {
            return search(root.right, key);
        }

        return false;


    }
}
