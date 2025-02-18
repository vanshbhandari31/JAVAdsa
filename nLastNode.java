package linkedlistmain;


public class nLastNode {

    public void findN(SLL.Node head, int n){
        SLL.Node cNode;
        SLL.Node ccNode;
        SLL.Node tNode;

        ccNode=head;
        tNode=null;
        cNode=head;
        int size=0;
        int i=0;
        while(cNode!=null){
            cNode=cNode.next;
            size++;
        }
        System.out.println(size);
        int search=size-n;
        System.out.println(search);
        while(i<search){
            ccNode=ccNode.next;
            i++;
        }
        ccNode.next=ccNode.next.next;

    }

    public static void main(String[] args) {
        SLL obj= new SLL();
        System.out.print("Find and Delete Nth Node from last\n");

        obj.addFirst("1");
        obj.addLast("2");
        obj.addLast("3");
        obj.addLast("4");
        obj.addLast("5");

        obj.printList();
        nLastNode obj3=new nLastNode();
        obj3.findN(obj.head, 3);
        obj.printList();
    }
}
