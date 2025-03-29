package BinaryTree;

import javax.xml.transform.Source;

public class heightOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT {
        static int idx = -1;

        public static Node build(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }

        public static int heightOftTree(Node root) {

            if (root == null) {
                return 0;
            }

            int leftHeight =heightOftTree(root.left);
            int rightHeight=heightOftTree(root.right);
            int height=Math.max(leftHeight,rightHeight);
            return height+1;

        }

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1,-1};
        BT tree = new BT();
        Node root = BT.build(nodes);
        System.out.println("The height of the given tree is " + BT.heightOftTree(root));
        System.out.println();
    }
}
