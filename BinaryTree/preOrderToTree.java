package BinaryTree;

public class preOrderToTree {
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
    static class BT{
        static int idx=-1;
        public static Node build(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=build(nodes);
            newNode.right=build(nodes);
            return newNode;
        }

    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree=new BT();
        Node root=tree.build(nodes);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.left.left.data);
        System.out.println(root.right.right.data);
        System.out.println(root.right.data);
    }

}
