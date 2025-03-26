package BinaryTree;

public class inOrderTraversal {
    static class Node{
        int data;
        inOrderTraversal.Node left;
        inOrderTraversal.Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BT{
        static int idx=-1;
        public static inOrderTraversal.Node build(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            inOrderTraversal.Node newNode=new inOrderTraversal.Node(nodes[idx]);
            newNode.left=build(nodes);
            newNode.right=build(nodes);
            return newNode;
        }
        public static void inOrder(inOrderTraversal.Node root) {
            if (root == null) {
                return;
            }

            inOrder(root.left);
            System.out.print(root.data + "\t");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        inOrderTraversal.BT tree=new inOrderTraversal.BT();
        inOrderTraversal.Node root= inOrderTraversal.BT.build(nodes);
        inOrderTraversal.BT.inOrder(root);
    }
}
