package BinaryTree;

public class subTreeCheck {
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
    static class BT {
        static int pidx= -1;
        static int sidx= -1;

        public static Node BuildParentTree(int Pnodes[]) {
            pidx++;
            if (pidx >= Pnodes.length ||Pnodes[pidx]== -1){
                return null;
            }
            Node newPNode= new Node(Pnodes[pidx]);
            newPNode.left=BuildParentTree(Pnodes);
            newPNode.right=BuildParentTree(Pnodes);
            return newPNode;
        }
        public static Node BuildSubTree(int Snodes[]) {
            sidx++;
            if (sidx >= Snodes.length || Snodes[sidx]== -1){
                return null;
            }
            Node newCNode= new Node(Snodes[sidx]);
            newCNode.left=BuildSubTree(Snodes);
            newCNode.right=BuildSubTree(Snodes);
            return newCNode;

        }
        public static boolean isIdent(Node root, Node subRoot) {
            if (root == null && subRoot == null) {
                return true;
            }
            if (root == null || subRoot == null || root.data != subRoot.data) {
                return false;
            }
            return isIdent(root.left, subRoot.left) && isIdent(root.right, subRoot.right);
        }

        public static boolean isSubTree(Node root, Node subRoot) {
            if (subRoot==null){
                return true;
            }
            if (root==null){
                return false;
            }
            if(root.data==subRoot.data){
                if(isIdent(root,subRoot)){
                    return true;
                }
            }
            return (isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot));

        }
    }

    public static void main(String[] args) {
        BT tree=new BT();
        int pnodes[] = {1, 2, 4, 5, -1, 5, -1, -1, 3, -1, 6, -1,-1};
        int snodes[] = {1, 2, 4, 5, -1, 5, -1, -1, 3, -1,6, -1,-1};
        int pidx=-1;
        Node root = BT.BuildParentTree(pnodes);
        int sidx=-1;
        Node subRoot = BT.BuildSubTree(snodes);
        System.out.println(BT.isSubTree(root,subRoot));


    }


}
