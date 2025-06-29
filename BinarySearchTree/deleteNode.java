package BinaryTree;
//to delete there will be three cases:
//1. node with 0 child ->  simply replace the node with null.
//2. node with 1 child  -> from its parent node , point to  its child node.
//3.node with 2 child - > replace value with inorder successor , delete the original inorder successor.
//inorder successor will have at most 1 child.
public class deleteNode {


        public static binarySearchTree.Node delete(binarySearchTree.Node root, int value) {
            if (root == null) return null;

            if (value < root.data) {
                root.left = delete(root.left, value);
            } else if (value > root.data) {
                root.right = delete(root.right, value);
            } else {
                // Node to be deleted found

                // CASE 1: No child
                if (root.left == null && root.right == null) {
                    return null;
                }

                // CASE 2: One child
                else if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                // CASE 3: Two children
                binarySearchTree.Node isu = inorderSucc(root.right);
                root.data = isu.data;
                root.right = delete(root.right, isu.data);
            }

            return root;
        }

        // Correct inorder successor method: find leftmost node in right subtree
        public static binarySearchTree.Node inorderSucc(binarySearchTree.Node root) {
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }
    }






