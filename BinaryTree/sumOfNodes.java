package BinaryTree;

public class sumOfNodes {
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

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int leftNodes = sumOfNodes(root.left);
            int rightNodes=sumOfNodes(root.right);
            return leftNodes+rightNodes+root.data;

        }

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1,-1};
        BT tree = new BT();
        Node root = BT.build(nodes);
        System.out.println("The number of nodes in the given tree is " + BT.sumOfNodes(root));
    }
}
